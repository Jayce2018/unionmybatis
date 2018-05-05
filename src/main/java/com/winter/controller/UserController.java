package com.winter.controller;

import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController

@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private String userid;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @ResponseBody
    @RequestMapping("/findUser")
    public User findUser(HttpServletRequest request){
        userid=request.getParameter("id");
        //System.out.println("11111111111111111");
        return userService.getUserbyId(userid);
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(HttpServletRequest request){
        userid=request.getParameter("id");
        int n=userService.deleteUser(userid);
        if(n==0) return "删除失败，没有找到对象！";
        return "delete success!";
    }
    @RequestMapping("/findAll")
    public List<User> findAll(){
       return userService.findAll();
    }

    @RequestMapping("/updateUser")
    public String updateUser(HttpServletRequest request){
        User user=new User();
        user.setId(request.getParameter("id"));
        user.setPassword(request.getParameter("ps"));
        int n=userService.update(user);
        if(n==0) return "更新失败，用户不存在！";
        return "update success!";
    }
}
