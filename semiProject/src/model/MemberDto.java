package model;

public class MemberDto {
	
	int usernum;
	String id;
	String pw;
	String name;
	String email;
	String phone;
	String sex;
	int auth;
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getUsernum() {
		return usernum;
	}
	public void setUsernum(int usernum) {
		this.usernum = usernum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAuth() {
		return auth;
	}
	public void setAuth(int auth) {
		this.auth = auth;
	}
	public MemberDto(int usernum, String id, String pw, String name, String email, String phone, String sex, int auth) {
		super();
		this.usernum = usernum;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.sex = sex;
		this.auth = auth;
	}
	
	public MemberDto(int usernum, String id, String name, int auth) {
		super();
		this.usernum = usernum;
		this.id = id;
		this.name = name;
		this.auth = auth;
	}
	
	

}
