package vn.banhang.model;

public class KhachHangModel {
	private String SoDT;
	private String MatKhau;
	private String HoTen;
	private String DiaChi;
	public KhachHangModel() {
		super();
	}
	
	public KhachHangModel(String soDT, String matKhau, String hoTen, String diaChi) {
		super();
		SoDT = soDT;
		MatKhau = matKhau;
		HoTen = hoTen;
		DiaChi = diaChi;
	}

	public String getSoDT() {
		return SoDT;
	}

	public void setSoDT(String soDT) {
		SoDT = soDT;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	
	@Override
	public String toString() {
		return "KhachHangModel [SoDT=" + SoDT + ", MatKhau=" + MatKhau 
				+ ", HoTen=" + HoTen + ", DiaChi=" + DiaChi + "]";
	}

}
