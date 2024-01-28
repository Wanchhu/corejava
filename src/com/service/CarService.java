package com.service;

import java.util.List;

import com.model.Car;

public interface CarService {
	
	void addCar(Car c);
	
	void deleteCar(int id);
	
	void updateCar(int id);
	
	List<Car> getAllCar(Car c);
		
	

}
