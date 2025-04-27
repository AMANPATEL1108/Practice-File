package com.example.crud.api.service;

import com.example.crud.api.Repository.CarRepository;
import com.example.crud.api.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CarServices {

    @Autowired
    private CarRepository carRepository;

    public String addcar(@RequestBody Car car) {
        carRepository.save(car);
        return "Car Added SuccesFully";
    }

    public List<Car> getAllCar() {
        return carRepository.findAll();
    }

    public String deleteCar(Integer id){
        carRepository.deleteById(id);
    return "deleted SuccesFully";
    }

    public Optional<Car> findById(Integer id){
        return carRepository.findById(id);
    }

    public String updatedById(@PathVariable Integer id,Car car){
        Optional<Car> existingCar= carRepository.findById(id);
        if (existingCar.isPresent()) {
            car.setId(id);
            carRepository.save(car);
            return "Updated";
        } else {
            return "Not Updated";
        }
    }




    public List<Car> findCarByNameservice(String name) { // Removed @PathVariable
        return carRepository.findCarByName(name);
    }

    public List<Car> findCarByVersionKeywordservice(String keyword) { // Removed @PathVariable
        return carRepository.findCarByVersionKeyword(keyword);
    }

}
