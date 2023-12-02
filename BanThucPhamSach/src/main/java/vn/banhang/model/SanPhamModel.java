package vn.banhang.model;

public class SanPhamModel {
	private String MaSP;
	private String TenSP;
	private int GiaSP;
	private double SoLuongTonKho;
	private String PhanLoai;
	private String DoTuoiKho;
	private double DanhGia;
	private int LuotDanhGia;
	private int GiamGia;
	private String MoTaSP;
	private String NgayNhapHang;
	private String HinhAnh;
	private int GiaDaGiam;

	public SanPhamModel() {
		super();
	}
	public SanPhamModel(String maSP, String tenSP, int giaSP, double soLuongTonKho, String phanLoai, String doTuoiKho, double danhGia, int luotDanhGia, int giamGia,String moTaSP, String ngayNhapHang, String hinhAnh) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		GiaSP = giaSP;
		SoLuongTonKho = soLuongTonKho;
		PhanLoai = phanLoai;
		DoTuoiKho = doTuoiKho;
		DanhGia = danhGia;
		LuotDanhGia = luotDanhGia;
		GiamGia = giamGia;
		MoTaSP = moTaSP;
		NgayNhapHang = ngayNhapHang;
		HinhAnh = hinhAnh;
		GiaDaGiam= giaSP -( giaSP * giamGia/100);
	}
	
	public SanPhamModel(String maSP) {
		super();
		MaSP = maSP;
	}
	public String getMaSP() {
		return MaSP;
	}
	public void setMaSP(String maSP) {
		MaSP = maSP;
	}
	public String getTenSP() {
		return TenSP;
	}
	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}
	public int getGiaSP() {
		return GiaSP;
	}
	public void setGiaSP(int giaSP) {
		GiaSP = giaSP;
	}
	public double getSoLuongTonKho() {
		return SoLuongTonKho;
	}
	public void setSoLuongTonKho(double soLuongTonKho) {
		SoLuongTonKho = soLuongTonKho;
	}
	public String getPhanLoai() {
		return PhanLoai;
	}
	public void setPhanLoai(String phanLoai) {
		PhanLoai = phanLoai;
	}
	public String getDoTuoiKho() {
		return DoTuoiKho;
	}
	public void setDoTuoiKho(String doTuoiKho) {
		DoTuoiKho = doTuoiKho;
	}
	public double getDanhGia() {
		return DanhGia;
	}
	public void setDanhGia(double danhGia) {
		DanhGia = danhGia;
	}
	public int getLuotDanhGia() {
		return LuotDanhGia;
	}
	public void setLuotDanhGia(int luotDanhGia) {
		LuotDanhGia = luotDanhGia;
	}
	public int getGiamGia() {
		return GiamGia;
	}
	public void setGiamGia(int giamGia) {
		GiamGia = giamGia;
	}
	public String getMoTaSP() {
		return MoTaSP;
	}
	public void setMoTaSP(String moTaSP) {
		MoTaSP = moTaSP;
	}
	public String getNgayNhapHang() {
		return NgayNhapHang;
	}
	public void setNgayNhapHang(String ngayNhapHang) {
		NgayNhapHang = ngayNhapHang;
	}
	public String getHinhAnh() {
		return HinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		HinhAnh = hinhAnh;
	}
	public int getGiaDaGiam() {
		return GiaDaGiam;
	}
	public void setGiaDaGiam(int giaDaGiam) {
		GiaDaGiam = giaDaGiam;
	}
	@Override
	public String toString() {
		return "SanPhamModel [MaSP=" + MaSP + ", TenSP=" + TenSP + ", GiaSP=" + GiaSP + ", SoLuongTonKho=" + SoLuongTonKho
				+ ", PhanLoai=" + PhanLoai + ", DoTuoiKho=" + DoTuoiKho + ", DanhGia=" + DanhGia + ", LuotDanhGia=" + LuotDanhGia
				+ ", GiamGia=" + GiamGia + ", MoTaSP=" + MoTaSP + ", NgayNhapHang=" + NgayNhapHang + ", HinhAnh=" + HinhAnh + "]";
	}
}
