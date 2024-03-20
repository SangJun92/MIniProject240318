package Mini;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.security.PublicKey;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BorderLayout01 extends JFrame {
	
	JTextField tfWriter, tfSubject;
	// 본문의 내용
	JTextArea tfContent;
	
	public BorderLayout01() {
		// 제목과 창크기 설정
		setTitle("성적 조회 프로그램");
		setSize(1200, 800);
//		setVisible(true); 프레임 출력
		
		
		// JPanel jp1을 생성(보더레이아웃을 적용)
		JPanel jp1 = new JPanel(new BorderLayout());
		add(jp1);
		
		JLabel jl = new JLabel("성적 조회 프로그램", JLabel.CENTER);
		jl.setFont(new Font("맑은고딕", Font.BOLD, 48));
		
		jp1.add(jl, BorderLayout.NORTH);
		
		// JPanel jp2를 생성(플로우레이아웃을 적용)
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
		jp2.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String ButtonName[] = {"등록하기", "학번조회", "이름조회", "삭제하기", "프로그램 종료"};
		for (int i = 0; i < ButtonName.length; i++) {
			JButton jb = new JButton(ButtonName[i]);
			jp2.add(jb);
		}
		jp1.add(jp2, BorderLayout.SOUTH);
		

//		Container c = getContentPane();
//		c.setLayout(new FlowLayout());
		
		
		Container c = new JPanel(new BorderLayout());
        jp1.add(c, BorderLayout.CENTER);
        
        JPanel formPanel = new JPanel(new BorderLayout());
        c.add(formPanel, BorderLayout.CENTER);
        
//        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // FlowLayout를 사용하여 왼쪽 정렬
//        formPanel.add(inputPanel, BorderLayout.WEST);
        
        JTextArea tfContent = new JTextArea(5, 20); // tfContent를 초기화하는 부분입니다.
        formPanel.add(new JScrollPane(tfContent), BorderLayout.CENTER); // JScrollPane을 사용하여 JTextArea를 감쌉니다.
		
        formPanel.add(new JLabel("학번 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
        formPanel.add(new JLabel("이름 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
        formPanel.add(new JLabel("연락처 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
        formPanel.add(new JLabel("학과 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
        formPanel.add(new JLabel("전공 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
        formPanel.add(new JLabel("교양 "), BorderLayout.WEST);
        formPanel.add(new JTextField(20), BorderLayout.CENTER);
       
        
        
        
//		c.add(new JLabel("학번 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("이름 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("연락처 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("학과 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("전공1 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("전공2 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("교양1 "));
//		c.add(new JTextField(20));
//		c.add(new JLabel("교양2 "));
//		c.add(new JTextField(20));
		
//		jp1.add(c, BorderLayout.CENTER);
		
//		JTextArea ta = new JTextArea(7, 20);
//		Container c2 = getContentPane();
//		c2.setLayout(new FlowLayout());
		

		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayout01();
		
		
		
	}

}
