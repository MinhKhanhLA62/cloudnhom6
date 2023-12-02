package vn.banhang.model;

public class DonHangModel {
	private String MaDon;
	private String NgayXuatDon;
	private AccountModel KhachHang;
	public DonHangModel() {
		super();
	}
	
	public DonHangModel(String maDon, String ngayXuatDon, AccountModel khachHang) {
		super();
		MaDon = maDon;
		NgayXuatDon = ngayXuatDon;
		KhachHang = khachHang;
	}


	public String getMaDon() {
		return MaDon;
	}


	public void setMaDon(String maDon) {
		MaDon = maDon;
	}


	public String getNgayXuatDon() {
		return NgayXuatDon;
	}


	public void setNgayXuatDon(String ngayXuatDon) {
		NgayXuatDon = ngayXuatDon;
	}


	public AccountModel getKhachHang() {
		return KhachHang;
	}


	public void setKhachHang(AccountModel khachHang) {
		KhachHang = khachHang;
	}


	@Override
	public String toString() {
		return "DonHangModel [MaDon=" + MaDon + ", NgayXuatDon=" + NgayXuatDon + ", KhachHang=" + KhachHang + "]";
	}
}
