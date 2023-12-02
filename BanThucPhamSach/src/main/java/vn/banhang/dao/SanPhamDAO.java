package vn.banhang.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.banhang.connection.DBConnect;
import vn.banhang.model.SanPhamModel;

public class SanPhamDAO {
	Connection conn=null;
//	Sử dụng các kêu Query
	PreparedStatement ps=null;
//	Xuất kết quả 
	ResultSet rs=null;
	
//	Hiển thị 3 sản phẩm mới nhất
//	@Override
	public List<SanPhamModel> getTop3SanPhamMoiNhat(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top 3 * from SanPham order by MaSP desc";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTop3SanPhamMoiNhat2(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top((select COUNT(*) from SanPham)-3) * from SanPham \r\n"
				+ "except \r\n"
				+ "select top((select COUNT(*) from SanPham)-6) * from SanPham ";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamDoTuoi(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where SanPham.DoTuoiKho=N'Đồ tươi'";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamDoKho(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where SanPham.DoTuoiKho=N'Đồ Khô'";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTop3SanPhamDanhGiaCao(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top(3) * from SanPham where DanhGia >=4 order by DanhGia desc";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTopSanPhamBanChay(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select SanPham.MaSP, SanPham.TenSP, SanPham.GiaSP, SanPham.SoLuongTonKho, SanPham.PhanLoai, SanPham.DoTuoiKho, SanPham.DanhGia, SanPham.LuotDanhGia, SanPham.GiamGia, SanPham.MoTaSP, SanPham.NgayNhapHang,SanPham.HinhAnh, topsp.TongSoBanRa\r\n"
				+ "			from SanPham, (select top(9) SanPham.MaSP, Sum(SoLuong) as TongSoBanRa from SanPham inner join ChiTietDonHang on SanPham.MaSP = ChiTietDonHang.MaSP\r\n"
				+ "											group by SanPham.MaSP order by TongSoBanRa)topsp\r\n"
				+ "			where SanPham.MaSP = topsp.MaSP";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getSanPhamTheoLoai(String phanLoai){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where PhanLoai= ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Gán giá trị cho dấu hỏi
			ps.setString(1, phanLoai);
//			Chạy câu query và nhân lại kết quả
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPham(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham ";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getAllSanPhamGiamGia(){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where GiamGia != 0";
		
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
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public SanPhamModel getOneSanPham(String maSP){

//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where MaSP = ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			ps.setString(1, maSP); 
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				return new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public List<SanPhamModel> get4SanPham(String maSP){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select top 4 * from SanPham where MaSP != ?";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
			ps.setString(1, maSP);
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public List<SanPhamModel> getTimKiemSanPham(String thongTinSP){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham where TenSP like ?";/*or MoTaSP like N'%?%'*/
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
//			Quăng dữ liệu vào dấu hỏi số 1
			ps.setString(1,"%" + thongTinSP + "%");
//			ps.setString(2, thongTinSP);
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public int getDemSoLuongSanPham(){
//		Khi báo chuỗi truy vấn 
		String sql ="select count(*) from SanPham";
		
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
				return rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	public List<SanPhamModel> getSanPhamPhanTrang(int index){
//		Khai báo List lưu danh sách sản phẩm
		List<SanPhamModel> list= new ArrayList<SanPhamModel>();
//		Khi báo chuỗi truy vấn 
		String sql ="select * from SanPham order by SanPham.MaSP offset ? row fetch next 6 rows only";
		
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
//			Chạy câu query và nhân lại kết quả
//			Quăng dữ liệu vào dấu hỏi số 1
			ps.setInt(1,(index-1)*6);
			rs=ps.executeQuery();
//			Lấy từ ResultSet đổ vào list
//			rs.next() chạy từng dòng
			while(rs.next()){
				list.add(new SanPhamModel(rs.getString(1),rs.getString(2),rs.getInt(3),
						rs.getDouble(4),rs.getString(5),rs.getString(6),rs.getDouble(7),
					rs.getInt(8),rs.getInt(9),rs.getString(10),rs.getString(11),rs.getString(12)));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public void themSanPham(String tenSP,int Gia,int soLuong,String phanLoai,
			String doTuoiKho,int giamGia,String moTa, String ngay, String hinhAnh) {
		String sql= "INSERT INTO SanPham VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			int a=getDemSoLuongSanPham()+2;
			
			String maSP = "SP0"+String.valueOf(a);	
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, maSP);
			ps.setString(2, tenSP);
			ps.setInt(3, Gia);
			ps.setInt(4, soLuong);
			ps.setString(5, phanLoai);
			ps.setString(6, doTuoiKho);
			ps.setInt(7, 0);
			ps.setInt(8, 0);
			ps.setInt(9, giamGia);
			ps.setString(10, moTa);
			ps.setString(11, ngay);
			ps.setString(12, hinhAnh);
			System.out.println("maSP "+maSP);
			System.out.println("tenSP "+tenSP);
			System.out.println("gia "+Gia);
			System.out.println("soluong "+soLuong);
			System.out.println("phan loai "+phanLoai);
			System.out.println("Loại SP: "+doTuoiKho);
			System.out.println("giam gia "+giamGia);
			System.out.println("mota "+ moTa);
			System.out.println("ngay "+ngay);
			System.out.println("hinh anh "+hinhAnh);
//			Chạy câu query và nhân lại kết quả
			ps.executeUpdate();
		} catch (Exception e) {
			 System.out.println("Error adding product: " + e.getMessage());
		        e.printStackTrace();
		}
	}

	public void suaSanPham(String tenSP,int Gia,double soLuong,String phanLoai,
							String doTuoiKho,int giamGia,String moTa, String ngay, String hinhAnh, String maSP) {
		String sql= "UPDATE SanPham set TenSP = ?, GiaSP = ?, SoLuongTonKho = ?, PhanLoai = ?, DoTuoiKho = ?, DanhGia = ?, LuotDanhGia = ?, " +
				"GiamGia = ?, MotaSP = ?, NgayNhapHang = ?, HinhAnh = ? where MaSP = ?";
		try {
//			Mở kết nối database
			conn= new DBConnect().getConnection();
//			Ném câu query vào SQL server
			ps = conn.prepareStatement(sql);
			ps.setString(1, tenSP);
			ps.setInt(2, Gia);
			ps.setDouble(3, soLuong);
			ps.setString(4, phanLoai);
			ps.setString(5, doTuoiKho);
			ps.setInt(6, 0);
			ps.setInt(7, 0);
			ps.setInt(8, giamGia);
			ps.setString(9, moTa);
			ps.setString(10, ngay);
			ps.setString(11, hinhAnh);
			ps.setString(12, maSP);

			System.out.println("maSP "+maSP);
			System.out.println("tenSP "+tenSP);
			System.out.println("gia "+Gia);
			System.out.println("soluong "+soLuong);
			System.out.println("phan loai "+phanLoai);
			System.out.println("Loại SP: "+doTuoiKho);
			System.out.println("giam gia "+giamGia);
			System.out.println("mota "+ moTa);
			System.out.println("ngay "+ngay);
			System.out.println("hinh anh "+hinhAnh);
//			Chạy câu query và nhân lại kết quả
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error adding product: " + e.getMessage());
			e.printStackTrace();
		}
	}
	public void xoaSanPham(String maSP) {

		String sql= "delete SanPham where MaSP= ?";
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
//	Test dữ liệu
//	public static void main(String[] args) {
//		SanPhamDAO pd=new SanPhamDAO();
//		pd.themSanPham("2", 10, 10, "LSP005","Đồ khô", 10, null, null, null);
//		SanPhamModel x= pd.getOneSanPham("SP025");
//		List<SanPhamModel> list=pd.getAllSanPham();
//		System.out.println(x);
//	}
}
