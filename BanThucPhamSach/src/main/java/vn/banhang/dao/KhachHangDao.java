package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.AccountModel;
import vn.banhang.model.KhachHangModel;
import vn.banhang.model.SanPhamModel;

public class KhachHangDao {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	public List<KhachHangModel> getAllTaiKhoan(){
//		Khai báo List lưu danh sách sản phẩm
		List<KhachHangModel> list= new ArrayList<KhachHangModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from KhachHang";
		
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
				list.add(new KhachHangModel(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
