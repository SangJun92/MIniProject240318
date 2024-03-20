package Mini;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class BorderLayout02 extends JFrame {
	public BorderLayout02() {
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
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp2.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String ButtonName[] = {"등록하기", "학번조회", "이름조회", "삭제하기", "프로그램 종료"};
		for (int i = 0; i < ButtonName.length; i++) {
			JButton jb = new JButton(ButtonName[i]);
			jp2.add(jb);
		}
		jp1.add(jp2, BorderLayout.SOUTH);
		
//		JTable table = new JTable(20, 5);
//		jp2.add(table.getTableHeader(), BorderLayout.CENTER);
//		jp2.add(table, BorderLayout.CENTER);
		
//		jp1.add(jp2, BorderLayout.CENTER);

		
		
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayout02();
		
		
		
	}

}
