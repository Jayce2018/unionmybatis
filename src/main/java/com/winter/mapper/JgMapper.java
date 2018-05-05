package com.winter.mapper;

import com.winter.model.unionJg;

import java.util.List;

public interface JgMapper {
    List<unionJg> findJg(Integer qnid);
}
