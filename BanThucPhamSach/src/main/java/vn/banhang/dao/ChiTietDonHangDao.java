package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.AccountModel;
import vn.banhang.model.ChiTietDonHangModel;
import vn.banhang.model.DonHangModel;
import vn.banhang.model.SanPhamModel;

public class ChiTietDonHangDao {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	public List<ChiTietDonHangModel> getAllDonHang(String maDon){
//		Khai báo List lưu danh sách sản phẩm
		List<ChiTietDonHangModel> list= new ArrayList<ChiTietDonHangModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from ChiTietDonHang where MaDon = ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, maDon); 
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new ChiTietDonHangModel(new DonHangModel(rs.getString(1),"",new AccountModel()) ,new SanPhamModel(rs.getString(2)),rs.getDouble(3)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
