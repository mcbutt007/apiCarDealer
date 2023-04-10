package com.nhom7java.cardealer.services;

import com.nhom7java.cardealer.models.Car;
import com.nhom7java.cardealer.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car updateCar(Long id, Car car) {
        Car existingCar = carRepository.findById(id).orElse(null);
        if (existingCar != null) {
            // Update the fields of the existing car with the new car data
            existingCar.setMake(car.getMake());
            existingCar.setModel(car.getModel());
            existingCar.setYear(car.getYear());
            //... update other fields as needed
            return carRepository.save(existingCar);
        } else {
            return null;
        }
    }

    public boolean deleteCar(Long id) {
        Car existingCar = carRepository.findById(id).orElse(null);
        if (existingCar != null) {
            carRepository.delete(existingCar);
            return true;
        } else {
            return false;
        }
    }
}
