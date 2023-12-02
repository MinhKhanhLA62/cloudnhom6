package vn.banhang.model;

public class ChiTietDonHangModel {
	private DonHangModel MaDon;
	private SanPhamModel MaSP;
	private double SoLuong;
	private float GiaTien;
	public ChiTietDonHangModel() {
		super();
	}
	
	public ChiTietDonHangModel(DonHangModel maDon, SanPhamModel maSP, double soLuong, float giaTien) {
		super();
		MaDon = maDon;
		MaSP = maSP;
		SoLuong = soLuong;
		GiaTien = giaTien;
	}
	public ChiTietDonHangModel(DonHangModel maDon, SanPhamModel maSP, double soLuong) {
		super();
		MaDon = maDon;
		MaSP = maSP;
		SoLuong = soLuong;
	}

	public float getGiaTien() {
		return GiaTien;
	}


	public void setGiaTien(float giaTien) {
		this.GiaTien = giaTien;
	}
	public DonHangModel getMaDon() {
		return MaDon;
	}



	public void setMaDon(DonHangModel maDon) {
		MaDon = maDon;
	}



	public SanPhamModel getMaSP() {
		return MaSP;
	}



	public void setMaSP(SanPhamModel maSP) {
		MaSP = maSP;
	}



	public double getSoLuong() {
		return SoLuong;
	}



	public void setSoLuong(double soLuong) {
		SoLuong = soLuong;
	}



	@Override
	public String toString() {
		return "ChiTietDonHangModel [MaDon=" + MaDon + ", MaSP=" + MaSP + ", SoLuong=" + SoLuong + "]";
	}
}
