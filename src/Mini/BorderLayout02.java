package Mini;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayout02 extends JFrame {
	public BorderLayout02() {
		setTitle("학사 일정 관리 프로그램");
		setSize(1200, 800);
		
		JPanel jp1 = new JPanel(new BorderLayout());
		add(jp1);
		
		JLabel jl = new JLabel("학사 일정 관리 프로그램", JLabel.CENTER);
		jl.setFont(new Font("맑은고딕", Font.BOLD, 48));
		
		jp1.add(jl, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayout02();
		
	}

}
