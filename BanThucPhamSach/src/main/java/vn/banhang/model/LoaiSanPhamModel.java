package vn.banhang.model;

public class LoaiSanPhamModel {
	private String MaLoai;
	private String TenLoai;
	public LoaiSanPhamModel() {
		super();
	}
	
	public LoaiSanPhamModel(String maLoai, String tenLoai) {
		super();
		MaLoai = maLoai;
		TenLoai = tenLoai;
	}

	public String getMaLoai() {
		return MaLoai;
	}

	public void setMaLoai(String maLoai) {
		MaLoai = maLoai;
	}

	public String getTenLoai() {
		return TenLoai;
	}

	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	
	@Override
	public String toString() {
		return "LoaiSanPhamModel [MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + "]";
	}
}
