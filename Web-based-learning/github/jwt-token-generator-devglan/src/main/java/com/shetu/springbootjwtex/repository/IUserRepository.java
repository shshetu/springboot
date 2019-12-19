package com.shetu.springbootjwtex.repository;

import com.shetu.springbootjwtex.model.User;

import java.util.List;

public interface IUserRepository {
    //find: List
    List<User> findUserList();
    //find: By name, id etc
    User findUserByUserId(Integer id);
    //add
    boolean addUser(User user);
    //update
    boolean updateUser(User user);
    //delete
    boolean deleteUser(Integer id);

}
