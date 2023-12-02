package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import vn.banhang.model.ChiTietDonHangModel;
import vn.banhang.connection.DBConnect;


public class DatHangDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
	public String ThemDonHang(String SDTKhachHang) {
		String sqlDonHang = "Insert into DonHang value(?,?,?)";
		DateFormat dateFormat1 = new SimpleDateFormat("ddMMyyHHmmss");
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String MaDon = SDTKhachHang + dateFormat1.format(date);
		String NgayXuatDon = dateFormat2.format(date);
		try {
			conn= new DBConnect().getConnection();
			ps = conn.prepareStatement(sqlDonHang);
			ps.setString(1, MaDon);
			ps.setString(2, NgayXuatDon);
			ps.setString(3, SDTKhachHang);
			ps.execute();
			
			return MaDon;
		} catch (Exception e) {
			System.out.println("Them don hang that bai");
			System.out.println(conn);
			System.out.println(sqlDonHang);
			System.out.println(MaDon);
			System.out.println(NgayXuatDon);
			System.out.println(SDTKhachHang);
		}
		return null;
	}
	
	public void ThemChiTietDonHang(String MaDon, List<ChiTietDonHangModel> listChiTiet) {
		String sqlChiTiet = "Insert into ChiTietDonHang value(?,?,?)";
		
		try {
			conn= new DBConnect().getConnection();
			for(ChiTietDonHangModel chitiet: listChiTiet) {
				ps = conn.prepareStatement(sqlChiTiet);
				ps.setString(1, MaDon);
				ps.setString(2, chitiet.getMaSP().getMaSP());
				ps.setDouble(3, chitiet.getSoLuong());
				ps.execute();
			}
		} catch (Exception e) {
			System.out.println("Them don hang that bai");
			System.out.println(sqlChiTiet);
		}
	}
}
