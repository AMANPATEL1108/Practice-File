package com.example.RelationPractice.api.Service;

import com.example.RelationPractice.api.Repository.UserRepository;
import com.example.RelationPractice.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public String addUser(User user) {
        userRepository.save(user);
        return "USer Added Successfully..........";
    }

    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public String userDeleteByID(Long id) {
        userRepository.deleteById(id);
        return "User Deleted Successfully";
    }

    public String userUpdatedById(Long id, User user) {
        User usexist = new User();
        if (usexist.getId() == id) {
            user.setId(id);
            userRepository.save(user);
        } else {
            return "Not Updated User Something Wrong";
        }


        return " Successfully Updated User";
    }


}
