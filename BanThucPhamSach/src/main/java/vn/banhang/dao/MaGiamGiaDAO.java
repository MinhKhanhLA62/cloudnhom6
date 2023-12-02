package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.MaGiamGiaModel;
import vn.banhang.model.SanPhamModel;

public class MaGiamGiaDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
//	Hiển thị 3 sản phẩm mới nhất
//	@Override
	public MaGiamGiaModel getMaGiamGia(String maGiamGia){
//		Khi báo chuỗi truy vấn 
		String sql ="select * from MaGiamGia where IDMaGiam = ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, maGiamGia);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				return new MaGiamGiaModel(rs.getString(1),rs.getInt(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
//	Test dữ liệu
//	public static void main(String[] args) {
//		MaGiamGiaDAO pd=new MaGiamGiaDAO();
//		MaGiamGiaModel list=pd.getMaGiamGia("MGGXUAN2023001");
//		System.out.println(list);
//	}
}
