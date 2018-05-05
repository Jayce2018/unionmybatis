package com.winter.mapper;

import com.winter.model.Questionnaire;

public interface QuestionnaireMapper {
    int deleteByPrimaryKey(Integer qnid);

    int insert(Questionnaire record);

    int insertSelective(Questionnaire record);

    Questionnaire selectByPrimaryKey(Integer qnid);

    int updateByPrimaryKeySelective(Questionnaire record);

    int updateByPrimaryKey(Questionnaire record);
}