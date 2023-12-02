package vn.banhang.model;

public class MaGiamGiaModel {
	private String IDMaGiam;
	private int PhanTram;
	public MaGiamGiaModel() {
		super();
	}
	
	public MaGiamGiaModel(String idMaGiam, int phanTram) {
		super();
		IDMaGiam = idMaGiam;
		PhanTram = phanTram;
	}

	public String getIDMaGiam() {
		return IDMaGiam;
	}

	public void setIDMaGiam(String iDMaGiam) {
		IDMaGiam = iDMaGiam;
	}

	public int getPhanTram() {
		return PhanTram;
	}

	public void setPhanTram(int phanTram) {
		PhanTram = phanTram;
	}
	
	@Override
	public String toString() {
		return "MaGiamGiaModel [IDMaGiam=" + IDMaGiam + ", PhanTram=" + PhanTram + "]";
	}
}
