package com.winter.serviceImpl;

import com.winter.mapper.UserMapper;
import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userdao;

    @Override
    public User getUserbyId(String id) {
        return userdao.selectByPrimaryKey(id);
    }

    @Override
    public int deleteUser(String id) {

        return userdao.deleteByPrimaryKey(id);
    }

    @Override
    public void addUser(User user) {
        try{
            userdao.insert(user);
            System.out.println("User insert success！");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<User> findAll() {
        return  userdao.selectAll();
    }

    @Override
    public int update(User user) {
        return userdao.updateByPrimaryKeySelective(user);
    }
}
