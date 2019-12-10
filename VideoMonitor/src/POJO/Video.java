package POJO;

import java.sql.Date;

public class Video {
	Integer vidID;
	String vidName;
	Date vidStartTime;
	String vidUrl;
	String vidSkchImgUrl;
	Integer vidType;
	Integer mptID;
	Integer staffID;
	
	public int getVidID() {
		return vidID;
	}
	public void setVidID(int vidID) {
		this.vidID = vidID;
	}
	public String getVidName() {
		return vidName;
	}
	public void setVidName(String vidName) {
		this.vidName = vidName;
	}
	public Date getVidStartTime() {
		return vidStartTime;
	}
	public void setVidStartTime(Date vidStartTime) {
		this.vidStartTime = vidStartTime;
	}
	public String getVidUrl() {
		return vidUrl;
	}
	public void setVidUrl(String vidUrl) {
		this.vidUrl = vidUrl;
	}
	public String getVidSkchImgUrl() {
		return vidSkchImgUrl;
	}
	public void setVidSkchImgUrl(String vidSkchImgUrl) {
		this.vidSkchImgUrl = vidSkchImgUrl;
	}
	public int getVidType() {
		return vidType;
	}
	public void setVidType(int vidType) {
		this.vidType = vidType;
	}
	public int getMptID() {
		return mptID;
	}
	public void setMptID(int mptID) {
		this.mptID = mptID;
	}
	public int getStaffID() {
		return staffID;
	}
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	@Override
	public String toString() {
		return "Video [vidID=" + vidID + ", vidName=" + vidName + ", vidStartTime=" + vidStartTime + ", vidUrl="
				+ vidUrl + ", vidSkchImgUrl=" + vidSkchImgUrl + ", vidType=" + vidType + ", mptID=" + mptID
				+ ", staffID=" + staffID + "]";
	}
	
		
}
