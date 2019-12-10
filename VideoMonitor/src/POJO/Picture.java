package POJO;

import java.sql.Date;

public class Picture {
	Integer imgID;
	String imgName;
	String imgRes;
	String imgSktUrl;
	String imgUrl;
	Integer imgType;
	Date createTime;
	Integer mptID;
	Integer staffID;
	
	public int getImgID() {
		return imgID;
	}
	public void setImgID(int imgID) {
		this.imgID = imgID;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public String getImgRes() {
		return imgRes;
	}
	public void setImgRes(String imgRes) {
		this.imgRes = imgRes;
	}
	public String getImgSktUrl() {
		return imgSktUrl;
	}
	public void setImgSktUrl(String imgSktUrl) {
		this.imgSktUrl = imgSktUrl;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getImgType() {
		return imgType;
	}
	public void setImgType(int imgType) {
		this.imgType = imgType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
		return "Picture [imgID=" + imgID + ", imgName=" + imgName + ", imgRes=" + imgRes + ", imgSktUrl=" + imgSktUrl
				+ ", imgUrl=" + imgUrl + ", imgType=" + imgType + ", createTime=" + createTime + ", mptID=" + mptID
				+ ", staffID=" + staffID + "]";
	}
	
	
}
