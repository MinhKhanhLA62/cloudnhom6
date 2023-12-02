package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.AccountModel;

public class LoginDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	public AccountModel dangNhapKH(String user, String pass) {

		String sql= "select * from KhachHang where SoDT=? and MatKhau=?";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				return new AccountModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),true);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public AccountModel dangNhapAdmin(String user, String pass) {

		String sql= "SELECT * FROM NguoiQuanLy where TenDangNhap = ? and MatKhau= ?";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				return new AccountModel(rs.getString(1),rs.getString(2),rs.getString(3),"",false);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public boolean checkTaiKhoan(String user) {
		boolean kiemTra=false;
		String sql= "select * from KhachHang where SoDT=?";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			if(rs.next()){
				kiemTra=true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kiemTra;
	}
	public void dangKi(String user, String pass, String ten, String diaChi) {

		String sql= "INSERT INTO KhachHang VALUES (?, ?, ?,?)";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, user);
			ps.setString(2, pass);
			ps.setString(3, ten);
			ps.setString(4, diaChi);
//			Chạy câu query và nhân lại kết quả
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
//	Test dữ liệu
//	public static void main(String[] args) {
//		LoginDAO pd=new LoginDAO();
//		AccountModel list=pd.dangNhap("0853000001","12345678");
//		System.out.println(list);
//	}
}
