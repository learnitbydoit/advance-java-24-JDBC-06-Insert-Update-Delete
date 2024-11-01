package vn.edu.eiu.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import vn.edu.eiu.database.JdbcDbConnector;
import vn.edu.eiu.model.KhachHang;

public class DAO_KhachHang implements DAO_Interface<KhachHang> {
	
	//hàm tạo mới đối tượng DAO KH
	public DAO_KhachHang getInstance() {
		return new DAO_KhachHang();
	}
	
	@Override
	public int insert(KhachHang t) {
		try {
			// 1. Tạo kết nối đến DB
			JdbcDbConnector jdc = new JdbcDbConnector();
			Connection c = jdc.getConnection();
			// 2. Tạo statement
			Statement st = c.createStatement();
			// 3. Thực thi câu lệnh SQL
			String sql = "INSERT INTO khachhang (hoVaTen, ngaySinh, diaChi) " + 
					"VALUES (\"" + t.getHoVaTen() + "\", \"" + t.getNgaySinh() + "\", \"" 
					+ t.getDiaChi() + "\")";
			
			int result =st.executeUpdate(sql);
			
			//4. Xử lý kết quả
			System.out.println("Statement executed: " + sql);
			System.out.println(result + " row(s) were effected!");
			
			//5. Ngắt kết nối
			jdc.closeConnection(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
