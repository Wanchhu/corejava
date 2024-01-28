package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Car;

public class CarServiceImpl implements CarService {

	static List<Car> clist = new ArrayList<>();
	@Override
	public void addCar(Car c) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb4pm","root","1111");
//			
//			String sql = "insert into car(name,company,model,color,price)values('"+c.getName()+"','"+c.getCompany()+"','"+c.getModel()+"','"+c.getColor()+"','"+c.getPrice()+"')";
//			java.sql.Statement stm = con.createStatement();
//			stm.execute(sql);
//			
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void deleteCar(int id) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb4pm","root","1111");
//			
//			String sql = "delete from car where id = "+id;
//			java.sql.Statement stm = con.createStatement();
//			stm.execute(sql);
//			
//			
//			
//			
//		}catch (Exception e) {
//	     e.printStackTrace();
//	}
	}

	@Override
	public void updateCar(int id) {
		try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb4pm","root","1111");
		
		String sql = "update car set price = 800000000 where id =   "+id;
		java.sql.Statement stm = con.createStatement();
		stm.execute(sql);
		}catch (Exception e) {
			e.printStackTrace();
		}
		}

	@Override
	public List<Car> getAllCar(Car c) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb4pm","root","1111");
		
		String sql = "select * from car";
		java.sql.Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while (rs.next()) {
		System.out.println("Name = "+rs.getString("name"));
		System.out.println("Model = "+rs.getString("model"));
		System.out.println("Company = "+rs.getString("company"));
		System.out.println("Color = "+rs.getString("color"));
		System.out.println("Price = "+rs.getInt("price"));
		}
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return clist;
		}
		

}
