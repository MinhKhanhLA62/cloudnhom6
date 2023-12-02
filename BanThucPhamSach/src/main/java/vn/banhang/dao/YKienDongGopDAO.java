package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import vn.banhang.connection.DBConnect;

public class YKienDongGopDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
	public void ThemEmailDongGop(String email, String hoTen, String yKien) {
		String sql = "Insert into YKienDongGop values(?,?,?,?)";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String ThoiGian = dateFormat.format(date);
		try {
			conn= new DBConnect().getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, hoTen);
			ps.setString(3, ThoiGian);
			ps.setString(4, yKien);
			ps.execute();
		} catch (Exception e) {
			System.out.println("Them email km that bai");
			System.out.println(sql);
		}
	}
}
