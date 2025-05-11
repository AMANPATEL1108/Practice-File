package com.example.RelationPractice.api.controller;

import com.example.RelationPractice.api.Service.AddressService;
import com.example.RelationPractice.api.model.Address;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @GetMapping("/addressById/{id}")
    public Address getAddressByID(@PathVariable Long id) {
        return addressService.getAddressByID(id);
    }

    @GetMapping("/getAllAddress")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @DeleteMapping("/deleteAddressById/{id}")
    public String addressDeletedByID(@PathVariable Long id) {
        return addressService.addressDeletedByID(id);
    }

    @PutMapping("/updateAddressById/{id}")
    public String addressUpdatedById(@PathVariable Long id, @RequestBody Address address) {
        return addressService.addressUpdatedById(id, address);
    }

}
