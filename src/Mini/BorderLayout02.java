package Mini;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BorderLayout02 extends JFrame {
	public BorderLayout02() {
		// 제목과 창크기 설정
		setTitle("학사 일정 관리 프로그램");
		setSize(1200, 800);
		
		// JPanel jp1을 생성(보더레이아웃을 적용)
		JPanel jp1 = new JPanel(new BorderLayout());
		add(jp1);
		
		JLabel jl = new JLabel("학사 일정 관리 프로그램", JLabel.CENTER);
		jl.setFont(new Font("맑은고딕", Font.BOLD, 48));
		
		jp1.add(jl, BorderLayout.CENTER);
		
		// JPanel jp2를 생성(플로우레이아웃을 적용)
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		jp2.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		String ButtonName[] = {"학점조회", "수강신청", "수강자 조회", "일정안내",	"프로그램 종료"};
		for (int i = 0; i < ButtonName.length; i++) {
			JButton jb = new JButton(ButtonName[i]);
			jp2.add(jb);
		}
		jp1.add(jp2, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayout02();
		
	}

}
