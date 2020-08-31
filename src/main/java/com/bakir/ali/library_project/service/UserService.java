package com.bakir.ali.library_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository

    public User saveUser(User user){

        return userRepository.save(user);
    }

    public User getUserById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    oublic void updateUser(User user){

        User user1 = userRepository.getOne(user.getId());

        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
        userRepository.save(user1);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
