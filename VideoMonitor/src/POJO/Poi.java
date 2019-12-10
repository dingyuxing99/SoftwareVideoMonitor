package POJO;

public class Poi {
	Integer poiID;
	Integer poiPixX;
	Integer poiPixY;
	Integer poiType;
	Integer rotID;
	
	public int getPoiID() {
		return poiID;
	}
	public void setPoiID(int poiID) {
		this.poiID = poiID;
	}
	public int getPoiPixX() {
		return poiPixX;
	}
	public void setPoiPixX(int poiPixX) {
		this.poiPixX = poiPixX;
	}
	public int getPoiPixY() {
		return poiPixY;
	}
	public void setPoiPixY(int poiPixY) {
		this.poiPixY = poiPixY;
	}
	public int getPoiType() {
		return poiType;
	}
	public void setPoiType(int poiType) {
		this.poiType = poiType;
	}
	public int getRotID() {
		return rotID;
	}
	public void setRotID(int rotID) {
		this.rotID = rotID;
	}

	@Override
	public String toString() {
		return "Poi [poiID=" + poiID + ", poiPixX=" + poiPixX + ", poiPixY=" + poiPixY + ", poiType=" + poiType
				+ ", rotID=" + rotID + "]";
	}
	
	
}
