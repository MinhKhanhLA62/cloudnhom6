package vn.banhang.model;

public class AccountModel {
	private String username;
	private String password;
	private String ten;
	private String diaChi;
	private boolean member;

	public AccountModel(String username, String password, String ten, String diaChi, boolean member) {
		super();
		this.username = username;
		this.password = password;
		this.ten = ten;
		this.diaChi = diaChi;
		this.member = member;
	}
	public AccountModel() {
		super();
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "AccountModel [username=" + username + ", password=" + password + ", ten=" + ten + ", diaChi=" + diaChi
				+ ", member=" + member + "]";
	}

	
}
