package com.example.SecDBConnectionExample.api.Service;

import com.example.SecDBConnectionExample.api.Repository.UserRepository;
import com.example.SecDBConnectionExample.api.model.ContactDetails;
import com.example.SecDBConnectionExample.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public String addUser(User user, ContactDetails contactDetails) {
        contactDetails.setUser(user);
        userRepository.save(user);
        return "User added Successfully";
    }


}
