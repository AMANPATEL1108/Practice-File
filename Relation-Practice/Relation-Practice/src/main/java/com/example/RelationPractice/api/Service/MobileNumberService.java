package com.example.RelationPractice.api.Service;

import com.example.RelationPractice.api.Repository.MobileNumberRepository;
import com.example.RelationPractice.api.model.MobileNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MobileNumberService {

    @Autowired
    private MobileNumberRepository mobileNumberRepository;


    public String addNumber(MobileNumber numbers) {
        mobileNumberRepository.save(numbers);

        return "Number Added Succesfully";

    }

    public MobileNumber getNumberById(Long id) {
        return mobileNumberRepository.getById(id);
    }

    public List<MobileNumber> getAllMobileNumber() {
        return mobileNumberRepository.findAll();
    }

    public String numberDeletedByID(Long id) {
        mobileNumberRepository.deleteById(id);
        return "Deleted Successfully";
    }

    public String numberUpdatedByID(Long id, MobileNumber mobileNumber) {
        MobileNumber mn = new MobileNumber();
        if (mn.getId() == id) {
            mn.setId(id);
            mobileNumberRepository.save(mobileNumber);
        } else {
            return "Not Updated Mobile Number Something Wrong";
        }

        return "Success Fully Updated Mobile Number";
    }


}
