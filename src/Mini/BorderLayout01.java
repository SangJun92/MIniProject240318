package Mini;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class BorderLayout01 extends JFrame implements ActionListener {

	JTextArea tfContent;
    JTextField tfStudentID, tfName, tfPhoneNumber, tfMajor1, tfMajor2, tfLiberalArts1, tfLiberalArts2;

    public BorderLayout01() {
        setTitle("성적 조회 프로그램");
        setSize(1200, 800);

        JPanel jp1 = new JPanel(new BorderLayout());
        add(jp1);

        JLabel jl = new JLabel("성적 조회 프로그램", JLabel.CENTER);
        jl.setFont(new Font("맑은고딕", Font.BOLD, 48));
        jp1.add(jl, BorderLayout.NORTH);

        JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
        jp2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jp1.add(jp2, BorderLayout.SOUTH);

        JButton registerButton = new JButton("등록하기");
        jp2.add(registerButton);
        registerButton.addActionListener(this);

        JButton searchByIDButton = new JButton("학번조회");
        jp2.add(searchByIDButton);
        searchByIDButton.addActionListener(this);

        JButton searchByNameButton = new JButton("이름조회");
        jp2.add(searchByNameButton);
        searchByNameButton.addActionListener(this);

        JButton deleteButton = new JButton("삭제하기");
        jp2.add(deleteButton);
        deleteButton.addActionListener(this);

        JButton exitButton = new JButton("프로그램종료");
        jp2.add(exitButton);
        exitButton.addActionListener(this);

        JPanel jp3 = new JPanel(new BorderLayout());
        jp1.add(jp3, BorderLayout.CENTER);

        tfContent = new JTextArea(20, 50);
        jp3.add(new JScrollPane(tfContent), BorderLayout.CENTER);

        JPanel formPanel = new JPanel(new GridLayout(7, 2));
        jp3.add(formPanel, BorderLayout.WEST);

        JLabel[] labels = {
            new JLabel("학번:"),
            new JLabel("이름:"),
            new JLabel("연락처:"),
            new JLabel("전공1:"),
            new JLabel("전공2:"),
            new JLabel("교양1:"),
            new JLabel("교양2:")
        };

        tfStudentID = new JTextField();
        tfName = new JTextField();
        tfPhoneNumber = new JTextField();
        tfMajor1 = new JTextField();
        tfMajor2 = new JTextField();
        tfLiberalArts1 = new JTextField();
        tfLiberalArts2 = new JTextField();

        JTextField[] textFields = {
            tfStudentID,
            tfName,
            tfPhoneNumber,
            tfMajor1,
            tfMajor2,
            tfLiberalArts1,
            tfLiberalArts2
        };

        for (int i = 0; i < labels.length; i++) {
            formPanel.add(labels[i]);
            formPanel.add(textFields[i]);
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout01();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
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
                System.exit(0);
                break;
            default:
                break;
        }
    }
}