package com.example.RelationPractice.api.controller;

import com.example.RelationPractice.api.Service.MobileNumberService;
import com.example.RelationPractice.api.model.MobileNumber;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mobileNumber")
public class MobileNumberController {

    private MobileNumberService mobileNumberService;

    @PostMapping("/addMobileNumber")
    public String addNumber(@RequestBody MobileNumber mobileNumber){
        return mobileNumberService.addNumber(mobileNumber);
    }

    @GetMapping("/getMobileNumberById/{id}")
    public MobileNumber getNumberById(@PathVariable Long id){
        return mobileNumberService.getNumberById(id);
    }

    @GetMapping
    public List<MobileNumber> getAllMobileNumber(){
        return mobileNumberService.getAllMobileNumber();
    }

    @DeleteMapping("/getNumberDeletedById/{id}")
    public String numberDeletedByID(@PathVariable Long id){
        return mobileNumberService.numberDeletedByID(id);
    }

    @PutMapping("/updateNumberByID/{id}")
    public String numberUpdatedByID(@PathVariable Long id,@RequestBody MobileNumber mobileNumber){
        return mobileNumberService.numberUpdatedByID(id,mobileNumber);
    }



}
