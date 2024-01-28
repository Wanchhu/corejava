package com.view;
import java.util.List;
import java.util.Scanner;

import com.model.Car;
import com.service.CarService;
import com.service.CarServiceImpl;


public class TestCar {

	public static void main(String[] args) {

		//add();
		//delete();
		updateCar();
		 // getAllCar();
		}
	
	static void add() {
		
		CarService cs = new CarServiceImpl();
		char flag = 'y';
		Scanner sc = new Scanner(System.in);
		
		Car c = new Car();
	
		do {
			System.out.println("Enter Name ");
			c.setName(sc.next());
			System.out.println("Enter Company ");
			c.setCompany(sc.next());
			System.out.println("Enter Model ");
			c.setModel(sc.next());
			System.out.println("Enter Color ");
			c.setColor(sc.next());
			System.out.println("Enter Price ");
			c.setPrice(sc.nextInt());
			
			cs.addCar(c);
			
			System.out.println("Do you want to add more [y/n]");
			flag = sc.next().charAt(0);
			} while (flag == 'y');
		    sc.close();
}
	
	static void delete() {
		Scanner sc = new Scanner(System.in);
		CarService cs = new CarServiceImpl();
		System.out.println("Enter Id");
		cs.deleteCar(sc.nextInt());
		
		
		System.out.println("Success");
        sc.close();
	}
	
	
	static void updateCar() {
	
	    CarService cs = new CarServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		cs.updateCar(sc.nextInt());
		System.out.println("Update Successful");
	sc.close();	
	}
        
	static void getAllCar() {
		CarService cs = new CarServiceImpl();
		Car c = new Car();
		List<Car> clist = cs.getAllCar(c);
		System.out.println(clist);
	}
	
}

