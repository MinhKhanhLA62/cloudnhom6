package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.SanPhamModel;

public class LoaiSanPhamDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	public List<LoaiSanPhamModel> getAllLoaiSanPham(){
//		Khai báo List lưu danh sách sản phẩm
		List<LoaiSanPhamModel> list= new ArrayList<LoaiSanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from LoaiSanPham ";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new LoaiSanPhamModel(rs.getString(1),rs.getString(2)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public void themLoaiSanPham(String maSP, String tenSP) {

		String sql= "INSERT INTO LoaiSanPham VALUES (?, ?)";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, maSP);
			ps.setString(2, tenSP);

//			Chạy câu query và nhân lại kết quả
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void xoaLoaiSanPham(String maSP) {

		String sql= "delete LoaiSanPham where MaLoai= ?";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, maSP);

//			Chạy câu query và nhân lại kết quả
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
