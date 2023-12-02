package vn.banhang;

import java.util.List;

import vn.banhang.dao.LoaiSanPhamDAO;
import vn.banhang.dao.LoginDAO;
import vn.banhang.dao.YKienDao;
import vn.banhang.model.AccountModel;
import vn.banhang.model.LoaiSanPhamModel;
import vn.banhang.model.YKienDongGopModel;

public class TestKey {
//	Test dữ liệu
	public static void main(String[] args) {
		YKienDao pd=new YKienDao();
		
		List<YKienDongGopModel> list=pd.getAllYKien();
		System.out.println(list);
	}
}
