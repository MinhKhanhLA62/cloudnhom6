package vn.banhang.model;

public class ThongTinEmailKhuyenMaiModel {
	private String Email;
	public ThongTinEmailKhuyenMaiModel() {
		super();
	}
	
	public ThongTinEmailKhuyenMaiModel(String email) {
		super();
		Email = email;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	@Override
	public String toString() {
		return "ThongTinEmailKhuyenMaiModel [Email=" + Email + "]";
	}
}
