package Mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.Font;

public class BorderLayout {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_5;
	private JLabel lblNewLabel_6;
	private JTextField textField_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					BorderLayout window = new BorderLayout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BorderLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("성적 조회 프로그램");
		frame.setBounds(100, 100, 1200, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new java.awt.BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		frame.getContentPane().add(panel, java.awt.BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("종료");
		btnNewButton.setBounds(1052, 615, 97, 23);
		panel.add(btnNewButton);
				
		JButton btnNewButton_1 = new JButton("삭제하기");
		btnNewButton_1.setBounds(943, 615, 97, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("학번조회");
		btnNewButton_2.setBounds(834, 615, 97, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("등록하기");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(727, 615, 97, 23);
		panel.add(btnNewButton_3);
		
		table = new JTable();
		table.setBounds(320, 89, 852, 496);
		panel.add(table);
		
		JLabel lblNewLabel = new JLabel("학번 :");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 131, 70, 20);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(76, 133, 210, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("이름 :");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 188, 70, 20);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(76, 190, 210, 21);
		panel.add(textField_1);
		
		lblNewLabel_2 = new JLabel("연락처 :");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 253, 70, 20);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(76, 252, 210, 21);
		panel.add(textField_2);
		
		lblNewLabel_3 = new JLabel("전공1 :");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_3.setBounds(12, 306, 70, 20);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(76, 308, 210, 21);
		panel.add(textField_3);
		
		lblNewLabel_4 = new JLabel("전공2 :");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_4.setBounds(12, 369, 70, 20);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(76, 369, 210, 21);
		panel.add(textField_4);
		
		lblNewLabel_5 = new JLabel("교양1 :");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_5.setBounds(12, 429, 70, 20);
		panel.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(76, 431, 210, 21);
		panel.add(textField_5);
		
		lblNewLabel_6 = new JLabel("교양2 :");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 14));
		lblNewLabel_6.setBounds(12, 486, 70, 20);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(76, 488, 210, 21);
		panel.add(textField_6);
		
		lblNewLabel_7 = new JLabel("성적 조회 프로그램", JLabel.CENTER);
		lblNewLabel_7.setFont(new Font("맑은 고딕", Font.BOLD, 48));
		lblNewLabel_7.setBounds(386, 10, 461, 50);
		panel.add(lblNewLabel_7);
	}
}
