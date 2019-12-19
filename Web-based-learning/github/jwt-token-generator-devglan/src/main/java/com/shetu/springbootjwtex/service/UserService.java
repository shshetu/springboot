package com.shetu.springbootjwtex.service;

import com.shetu.springbootjwtex.model.User;
import com.shetu.springbootjwtex.repository.impl.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    //autowire repository
    @Autowired
    private UserRepositoryImpl userRepository;

    //find: List
    public List<User> findUserList(){
        return userRepository.findUserList();
    }
    //find: by userid, name etc
    public User findUserById(Integer id){
        return userRepository.findUserByUserId(id);
    }
    //add
    public boolean addUser(User user){
        return userRepository.addUser(user);
    }
    //update
    public boolean updateUser(User user){
        return userRepository.updateUser(user);
    }
    //delete
    public boolean deleteUser(Integer id){
        return userRepository.deleteUser(id);
    }
}
