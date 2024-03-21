package Mini;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Mini.Border_DAO;

public class BorderLayout01 extends JFrame implements ActionListener {

    JTextField tfStudentID, tfName, tfPhoneNumber, tfMajor1, tfMajor2, tfLiberalArts1, tfLiberalArts2;
    Border_DAO borderDAO; // Border_DAO 객체 생성

    public BorderLayout01() {
        setTitle("성적 조회 프로그램");
        setSize(1200, 700);

        JPanel jp1 = new JPanel(new BorderLayout());
        add(jp1);

        JLabel jl = new JLabel("성적 조회 프로그램", JLabel.CENTER);
        jl.setFont(new Font("맑은고딕", Font.BOLD, 24));
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

        JPanel formPanel = new JPanel(new GridBagLayout());
        jp1.add(formPanel, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel[] labels = {
            new JLabel("학번:"),
            new JLabel("이름:"),
            new JLabel("연락처:"),
            new JLabel("전공1:"),
            new JLabel("전공2:"),
            new JLabel("교양1:"),
            new JLabel("교양2:")
        };

        tfStudentID = new JTextField(20);
        tfName = new JTextField(20);
        tfPhoneNumber = new JTextField(20);
        tfMajor1 = new JTextField(20);
        tfMajor2 = new JTextField(20);
        tfLiberalArts1 = new JTextField(20);
        tfLiberalArts2 = new JTextField(20);

        JTextField[] textFields = {
            tfStudentID,
            tfName,
            tfPhoneNumber,
            tfMajor1,
            tfMajor2,
            tfLiberalArts1,
            tfLiberalArts2
        };

        gbc.gridx = 0;
        gbc.gridy = 0;
        for (int i = 0; i < labels.length; i++) {
            formPanel.add(labels[i], gbc);
            gbc.gridx = 1;
            formPanel.add(textFields[i], gbc);
            gbc.gridx = 0;
            gbc.gridy++;
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Border_DAO 객체 생성
        borderDAO = new Border_DAO();
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
                // DAO 메서드 호출하여 데이터베이스에 정보 저장
                String studentID = tfStudentID.getText();
                String name = tfName.getText();
                String phoneNumber = tfPhoneNumber.getText();
                String major1 = tfMajor1.getText();
                String major2 = tfMajor2.getText();
                String liberalArts1 = tfLiberalArts1.getText();
                String liberalArts2 = tfLiberalArts2.getText();
                
                Border_DAO dao = new Border_DAO();
                dao.saveGradesInfo(studentID, name, phoneNumber, major1, major2, liberalArts1, liberalArts2);
                
                JOptionPane.showMessageDialog(this, "등록되었습니다.");
                break;
                
            case "학번조회":
                // 학번 조회 로직
                String studentID1 = tfStudentID.getText();
                // Border_DAO 객체를 통해 학번에 해당하는 정보를 조회하는 메서드 호출
                String resultByID = borderDAO.searchByID(studentID1);
                // 조회 결과를 다이얼로그로 출력
                JOptionPane.showMessageDialog(this, resultByID);
                break;
            case "이름조회":
                // 이름 조회 로직
                String name1 = tfName.getText();
                // Border_DAO 객체를 통해 이름에 해당하는 정보를 조회하는 메서드 호출
                String resultByName = borderDAO.searchByName(name1);
                // 조회 결과를 다이얼로그로 출력
                JOptionPane.showMessageDialog(this, resultByName);
                break;
                
            case "삭제하기":
                // 삭제할 학번을 입력 받습니다.
                String deleteStudentID = JOptionPane.showInputDialog("삭제할 학번을 입력하세요:");

                // Border_DAO 객체를 생성합니다.
                Border_DAO dao1 = new Border_DAO();
                
                // DAO 메서드를 호출하여 해당 학생의 정보를 삭제합니다.
                dao1.deleteGradesInfo(deleteStudentID);

                // 삭제 완료 메시지를 표시합니다.
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