package com.winter.controller;


import com.winter.model.unionJg;
import com.winter.service.JgService;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
@RequestMapping("/jg")
public class JgController {
    @Autowired
    private  JgService jgService;

    private Integer qnid;

    @RequestMapping("/findJg")
    public List<unionJg> findJg(HttpServletRequest request){
        System.out.println("*******************************JgController:aaaa");
        qnid=Integer.parseInt(request.getParameter("qnid"));
        return jgService.findJq(qnid);
    }
}
