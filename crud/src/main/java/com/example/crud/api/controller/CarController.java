package com.example.crud.api.controller;

import com.example.crud.api.model.Car;
import com.example.crud.api.service.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarServices carServices;

    @PostMapping("/addcar")
    public String addcar(@RequestBody Car car) {
        carServices.addcar(car);
        return "Car Added SuccesFully";
    }

    @GetMapping("/getallcar")
    public List<Car> gatallcars(){
        return carServices.getAllCar();
    }

    @DeleteMapping("/deletcar/{id}")
    public String deleteCar(@PathVariable Integer id){
        carServices.deleteCar(id);
        return "Deleted SuccesFully";
    }

    @GetMapping("/getbyid/{id}")
    public Optional<Car> getcarById(@PathVariable Integer id){
        return carServices.findById(id);
    }


    @PutMapping("/updatedbyid/{id}")
    public String updatedById(@PathVariable Integer id,@RequestBody Car car){
        return carServices.updatedById(id,car);
    }


}
