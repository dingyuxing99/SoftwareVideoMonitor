package POJO;

import java.sql.Date;

public class AlarmRecord {
	Integer almRecID;
	Date almTime;
	double optLocX;
	double optLocY;
	Integer isHandled;
	Integer mptID;
	double rotAngle;
	Integer staffID;
	
	public int getAlmRecID() {
		return almRecID;
	}
	public void setAlmRecID(int almRecID) {
		this.almRecID = almRecID;
	}
	public Date getAlmTime() {
		return almTime;
	}
	public void setAlmTime(Date almTime) {
		this.almTime = almTime;
	}
	public double getOptLocX() {
		return optLocX;
	}
	public void setOptLocX(double optLocX) {
		this.optLocX = optLocX;
	}
	public double getOptLocY() {
		return optLocY;
	}
	public void setOptLocY(double optLocY) {
		this.optLocY = optLocY;
	}
	public int getIsHandled() {
		return isHandled;
	}
	public void setIsHandled(int isHandled) {
		this.isHandled = isHandled;
	}
	public int getMptID() {
		return mptID;
	}
	public void setMptID(int mptID) {
		this.mptID = mptID;
	}
	public double getRotAngle() {
		return rotAngle;
	}
	public void setRotAngle(double rotAngle) {
		this.rotAngle = rotAngle;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	@Override
	public String toString() {
		return "AlarmRecord [almRecID=" + almRecID + ", almTime=" + almTime + ", optLocX=" + optLocX + ", optLocY="
				+ optLocY + ", isHandled=" + isHandled + ", mptID=" + mptID + ", rotAngle=" + rotAngle + ", staffID="
				+ staffID + "]";
	}
	
	
	
}
