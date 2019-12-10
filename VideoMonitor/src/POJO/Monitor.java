package POJO;

public class Monitor {
	Integer mptID;
	String mptName;
	String mptIP;
	double height;
	Integer poiID;
	
	public int getMptID() {
		return mptID;
	}
	public void setMptID(int mptID) {
		this.mptID = mptID;
	}
	public String getMptName() {
		return mptName;
	}
	public void setMptName(String mptName) {
		this.mptName = mptName;
	}
	public String getMptIP() {
		return mptIP;
	}
	public void setMptIP(String mptIP) {
		this.mptIP = mptIP;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getPoiID() {
		return poiID;
	}
	public void setPoiID(int poiID) {
		this.poiID = poiID;
	}

	@Override
	public String toString() {
		return "Monitor [mptID=" + mptID + ", mptName=" + mptName + ", mptIP=" + mptIP + ", height=" + height
				+ ", poiID=" + poiID + "]";
	}
	
	
}
