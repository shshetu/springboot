package com.shetu.springbootjwtex.repository.impl;

import com.shetu.springbootjwtex.model.User;
import com.shetu.springbootjwtex.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.List;
@Repository
public class UserRepositoryImpl implements IUserRepository {
   //Autowire jdbc template
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //Declare global variables: query,userList,user, rowMapper and postconstruct it
    private BeanPropertyRowMapper<User> rowMapper = null;
    private String query = null;
    private List<User> userList = null;
    private User user = null;

    //init method
    @PostConstruct
    private void init(){
        rowMapper = new BeanPropertyRowMapper().newInstance(User.class);
    }

    @Override
    public List<User> findUserList() {
        query = "select * from user";
        try {
        userList = jdbcTemplate.query(query,rowMapper);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User findUserByUserId(Integer id) {
        query = "select * from user where id = ?";
        try {
            user=jdbcTemplate.queryForObject(query, new Object[]{id}, rowMapper);
        }catch (Exception e){
            e.printStackTrace();
        }
    return user;
    }

    @Override
    public boolean addUser(User user) {
        query = "insert into user(first_name,last_name,user_name,password,salary,age)" +
                " values(?,?,?,?,?,?)";
        try {
            jdbcTemplate.update(query,user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),user.getSalary(),user.getAge());
            return true;
        }catch (Exception e){
        e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        query = "update user set first_name =?,last_name=?,user_name=?password=?,salary=?,age=? where id=?";
    try {
        jdbcTemplate.update(query,user.getFirstName(),user.getLastName(),user.getUserName(),user.getPassword(),user.getSalary(),user.getAge(),user.getId());
        return true;
    }catch (Exception e){
        e.printStackTrace();
    }
    return false;
    }

    @Override
    public boolean deleteUser(Integer id) {
       query = "delete from user where id=?";
       try {
           jdbcTemplate.update(query,id);
           return true;
       }catch (Exception e){
           e.printStackTrace();
       }
       return false;
    }
}
