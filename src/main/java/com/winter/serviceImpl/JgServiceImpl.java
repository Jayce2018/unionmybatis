package com.winter.serviceImpl;

import com.winter.mapper.JgMapper;
import com.winter.model.unionJg;
import com.winter.service.JgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JgServiceImpl implements JgService {
    @Autowired
    private JgMapper jgMapper;
    private  Integer qnid;
    @Override
    public List<unionJg> findJq(Integer qnid) {
        System.out.println("*******************************JgServiceImpl:aaaa");
        this.qnid=qnid;

        return jgMapper.findJg(qnid);
    }
}
