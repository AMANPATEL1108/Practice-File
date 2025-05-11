package com.example.RelationPractice.api.Service;

import com.example.RelationPractice.api.Repository.AddressRepository;
import com.example.RelationPractice.api.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AddressService {


    @Autowired
    private AddressRepository addressRepository;


    public String addAddress(Address address) {
        addressRepository.save(address);
        return "Address Added Successfully";
    }

    public Address getAddressByID(Long id) {
        return addressRepository.getById(id);
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public String addressDeletedByID(Long id) {
        addressRepository.deleteById(id);
        return "Address Deleted Successfully";
    }

    public String addressUpdatedById(Long id, Address address) {
        Address ad = new Address();
        if (address.getId() == id) {
            ad.setId(id);
            addressRepository.save(address);
        } else {
            return "Address Not Updated SuccessFully Something Wrong";
        }

        return "Address Updated SuccessFully";
    }


}
