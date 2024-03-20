package Mini;

public class Border_DAO {

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	private static final String USER = "system"; // DB ID
	private static final String PASS = "oracle"; // DB 패스워드

	BorderLayout borderLayout;
	
	public Border_DAO() {
		
	};
	
}
