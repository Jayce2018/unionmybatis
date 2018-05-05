package com.winter.service;

import com.winter.model.User;

import java.util.List;

public interface UserService {
     User getUserbyId(String id);

     int deleteUser(String id);

     void addUser(User user);

     List<User> findAll();

     int update(User user);
}
