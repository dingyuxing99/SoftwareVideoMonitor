package POJO;

public class User {
	Integer userID;
	String userName;
	String userPwd;
	Integer userRight;
	String userMail;
	String userPhone;
	String userDept;
	String empTime;
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getUserRight() {
		return userRight;
	}
	public void setUserRight(int userRight) {
		this.userRight = userRight;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
	public String getEmpTime() {
		return empTime;
	}
	public void setEmpTime(String empTime) {
		this.empTime = empTime;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userPwd=" + userPwd + ", userRight=" + userRight
				+ ", userMail=" + userMail + ", userPhone=" + userPhone + ", userDept=" + userDept + ", empTime="
				+ empTime + "]";
	}
	
		
}
