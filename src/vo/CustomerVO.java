package vo;

//조회한 것을 담을 객체
public class CustomerVO {
	
	// Fields
	private String csid;
	private String cspwd;
	private String fname;
	private String lname;
	private String email;
	private String[] v;
	
	
	// Constructor : class 외부에서 넘어오는 정보를 받기위해 - setter 역할
	// 생성자가 있으면 setter가 필요없다 - 하지만 나중에 값 변경 불가(setter 있으면 가능) 
	public CustomerVO(String csid, String cspwd, String fname, String lname, String email) {
		this.csid 	= csid;
		this.cspwd 	= cspwd;
		this.fname 	= fname;
		this.lname 	= lname;
		this.email  = email;
	}

	// Getter : 내 클래스의 정보(Fields)를 외부로 내보냄
	// Setter : 내 클래스의 정보를 외부에서 수정하고자 할 때
	public String getId() {
		return csid;
	}

	public void setId(String csid) {
		this.csid = csid;
	}

	public String getPwd() {
		return cspwd;
	}

	public void setPwd(String cspwd) {
		this.cspwd = cspwd;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// toString : for debugging
	@Override
	public String toString() {
		return "CustomerVO [id=" + csid + ", pwd=" + cspwd + ", fname=" + fname + ", lname=" + lname + ", email=" + email+ "]";
	}
		
}