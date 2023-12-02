package vn.banhang.model;

public class YKienDongGopModel {
	private String Email;
	private String HoTen;
	private String ThoiGian;
	private String YKien;
	public YKienDongGopModel() {
		super();
	}
	
	public YKienDongGopModel(String email, String hoTen, String thoiGian, String yKien) {
		super();
		Email = email;
		HoTen = hoTen;
		ThoiGian = thoiGian;
		YKien = yKien;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public String getThoiGian() {
		return ThoiGian;
	}

	public void setThoiGian(String thoiGian) {
		ThoiGian = thoiGian;
	}

	public String getYKien() {
		return YKien;
	}

	public void setYKien(String yKien) {
		YKien = yKien;
	}
	
	@Override
	public String toString() {
		return "YKienDongGopModel [Email=" + Email + ", HoTen=" + HoTen
				+ ", ThoiGian=" + ThoiGian + ", YKien=" + YKien + "]";
	}
}
