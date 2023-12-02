package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import vn.banhang.connection.DBConnect;


public class EmailKhuyenMaiDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
	public void ThemEmailKhuyenMai(String email) {
		String sql = "Insert into ThongTinEmailKhuyenMai value(?)";
		try {
			conn= new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.execute();
		} catch (Exception e) {
			System.out.println("Them email km that bai");
			System.out.println(sql);
		}
	}
}
