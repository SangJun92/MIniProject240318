package Mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Border_DAO {

    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final String USER = "system"; // DB ID
    private static final String PASS = "oracle"; // DB 패스워드

    BorderLayout borderLayout;

    public Border_DAO() {

    }

    public Border_DAO(BorderLayout borderLayout) {
        this.borderLayout = borderLayout;
        System.out.println("DAO =>" + borderLayout);
    }

    /** DB 연결 메소드 */
    public Connection getConn() {
        Connection con = null;

        try {
            Class.forName(DRIVER); // 1. 드라이버 로딩
            con = DriverManager.getConnection(URL, USER, PASS); // 2. 드라이버 연결
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    /** 데이터베이스에 정보 저장하는 메서드 */
    public void saveGradesInfo(String studentID, String name, String phoneNumber, String major1, String major2, String liberalArts1, String liberalArts2) {
        Connection con = null;
        try {
            con = getConn(); // 데이터베이스 연결

            // SQL 쿼리 작성
            String sql = "INSERT INTO MiniJava (학번, 이름, 연락처, 전공1, 전공2, 교양1, 교양2) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // SQL 쿼리에 파라미터 설정
            pstmt.setString(1, studentID);
            pstmt.setString(2, name);
            pstmt.setString(3, phoneNumber);
            pstmt.setString(4, major1);
            pstmt.setString(5, major2);
            pstmt.setString(6, liberalArts1);
            pstmt.setString(7, liberalArts2);

            // SQL 쿼리 실행
            pstmt.executeUpdate();

            System.out.println("데이터베이스에 정보 저장 완료");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 연결 해제
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String searchByID(String studentID) {
        String result = "";
        Connection con = null;

        try {
            con = getConn(); // 데이터베이스 연결

            // SQL 쿼리 작성
            String sql = "SELECT * FROM MiniJava WHERE 학번 = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentID);

            // SQL 쿼리 실행
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                result = "학번: " + rs.getString("학번") + "\n";
                result += "이름: " + rs.getString("이름") + "\n";
                result += "연락처: " + rs.getString("연락처") + "\n";
                result += "전공1: " + rs.getString("전공1") + "\n";
                result += "전공2: " + rs.getString("전공2") + "\n";
                result += "교양1: " + rs.getString("교양1") + "\n";
                result += "교양2: " + rs.getString("교양2") + "\n";
            } else {
                result = "해당 학번의 정보가 없습니다.";
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 연결 해제
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    /** 이름으로 정보 조회하는 메서드 */
    public String searchByName(String name) {
        String result = "";
        Connection con = null;

        try {
            con = getConn(); // 데이터베이스 연결

            // SQL 쿼리 작성
            String sql = "SELECT * FROM MiniJava WHERE 이름 = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, name);

            // SQL 쿼리 실행
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                result = "학번: " + rs.getString("학번") + "\n";
                result += "이름: " + rs.getString("이름") + "\n";
                result += "연락처: " + rs.getString("연락처") + "\n";
                result += "전공1: " + rs.getString("전공1") + "\n";
                result += "전공2: " + rs.getString("전공2") + "\n";
                result += "교양1: " + rs.getString("교양1") + "\n";
                result += "교양2: " + rs.getString("교양2") + "\n";
            } else {
                result = "해당 이름의 정보가 없습니다.";
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 연결 해제
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    
    
    
    

    public void deleteGradesInfo(String studentID) {
        Connection con = null;

        try {
            con = getConn(); // 데이터베이스 연결

            // SQL 쿼리 작성
            String sql = "DELETE FROM MiniJava WHERE 학번 = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // SQL 쿼리에 파라미터 설정
            pstmt.setString(1, studentID);

            // SQL 쿼리 실행
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("데이터베이스에서 정보 삭제 완료");
            } else {
                System.out.println("삭제할 데이터가 없습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 연결 해제
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
