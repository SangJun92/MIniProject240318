package Mini;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BorderLayout01 extends JFrame implements ActionListener {

    JTextField tfWriter, tfSubject;
    JTextArea tfContent;

    public BorderLayout01() {
        setTitle("성적 조회 프로그램");
        setSize(1200, 800);

        JPanel jp1 = new JPanel(new BorderLayout());
        add(jp1);

        JLabel jl = new JLabel("성적 조회 프로그램", JLabel.CENTER);
        jl.setFont(new Font("맑은고딕", Font.BOLD, 48));
        jp1.add(jl, BorderLayout.NORTH);

        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
        jp2.setBorder(new EmptyBorder(10, 10, 10, 10));

//        String ButtonName[] = {"등록하기", "학번조회", "이름조회", "삭제하기", "프로그램 종료"};
//        for (int i = 0; i < ButtonName.length; i++) {
//            JButton jb = new JButton(ButtonName[i]);
//            jp2.add(jb);
//        }
        jp1.add(jp2, BorderLayout.SOUTH);

        JButton registerButton = new JButton("등록하기");
        jp2.add(registerButton);
        registerButton.addActionListener(this);
        
        JButton registerButton1 = new JButton("학번조회");
        jp2.add(registerButton1);
        registerButton1.addActionListener(this);
        
        JButton registerButton2 = new JButton("이름조회");
        jp2.add(registerButton2);
        registerButton2.addActionListener(this);
        
        JButton registerButton3 = new JButton("삭제하기");
        jp2.add(registerButton3);
        registerButton3.addActionListener(this);
        
        JButton registerButton4 = new JButton("프로그램종료");
        jp2.add(registerButton4);
        registerButton4.addActionListener(this);

        Container c = new JPanel(new BorderLayout());
        jp1.add(c, BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new BorderLayout());
        c.add(formPanel, BorderLayout.CENTER);

        JTextArea tfContent = new JTextArea(5, 20);
        formPanel.add(new JScrollPane(tfContent), BorderLayout.CENTER);

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

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout01();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//    	JOptionPane.showMessageDialog(this, "등록되었습니다.");
//        System.out.println("등록하기 버튼이 클릭되었습니다.");
    	
    	JButton sourceButton = (JButton) e.getSource();
        String buttonLabel = sourceButton.getText();
    	
        switch (buttonLabel) {
        case "등록하기":
            JOptionPane.showMessageDialog(this, "등록되었습니다.");
            break;
        case "삭제하기":
            JOptionPane.showMessageDialog(this, "삭제되었습니다.");
            break;
        case "프로그램종료":
            JOptionPane.showMessageDialog(this, "프로그램 종료합니다.");
            // 프로그램 종료
            System.exit(0);
            break;
        default:
            // 기본 동작 추가
            // 예: JOptionPane.showMessageDialog(this, "기본 동작입니다.");
            break;
    }
    }
    
}

