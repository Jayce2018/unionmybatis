package com.winter.mapper;

import com.winter.model.Option;

public interface OptionMapper {
    int deleteByPrimaryKey(Integer optionid);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Integer optionid);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}