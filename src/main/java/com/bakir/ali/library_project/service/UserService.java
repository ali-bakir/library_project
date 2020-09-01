package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.User;
import com.bakir.ali.library_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){

        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public void updateUser(User user){

        User user1 = userRepository.getOne(user.getId());

        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        userRepository.save(user1);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
