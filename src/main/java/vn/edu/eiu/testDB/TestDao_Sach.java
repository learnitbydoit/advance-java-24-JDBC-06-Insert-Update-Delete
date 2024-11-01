package vn.edu.eiu.testDB;

import vn.edu.eiu.dao.DAO_Sach;
import vn.edu.eiu.model.Sach;
/**
 * Lưu ý: để chạy test class này, các bạn chạy bằng Java Application
 */
public class TestDao_Sach {

	public static void main(String[] args) {
		/*
		//Test INSERT
		Sach s1 = new Sach("CSE456", "Advance Java Programing", 125000, 2020);
		Sach s2 = new Sach("CSE106", "Discrete Mathematics 1", 80000, 2018);
		
		//Thực thi thêm dữ liệu vào database
		DAO_Sach.getInstance().insert(s1);
		DAO_Sach.getInstance().insert(s2);
		
		//Thực thi thêm hàng loạt vào database
		for(int i = 1; i <= 5; i++) {
			Sach s = new Sach("CSE49"+i,"Project " + i, 100000,2024);
			DAO_Sach.getInstance().insert(s);
		}
		*/
		Sach s3 = new Sach("CSE457", "Lập trình Dotnet", 150000, 2019);
		DAO_Sach.getInstance().insert(s3);
		/*
		//Test UPDATE
		Sach s3 = new Sach("CSE456","Advance Java Programing",250000,2023);
		DAO_Sach.getInstance().update(s3);
		
		*/
		
		//Test delete
		//Sach s4 = new Sach("CSE494", null, 0, 0);
		//DAO_Sach.getInstance().delete(s4);
		

	}

}
