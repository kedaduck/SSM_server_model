package com.leoren.play.dao;

import com.leoren.play.pojo.Attraction;

import java.util.List;

public interface AttractionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Attraction record);

    int insertSelective(Attraction record);

    Attraction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attraction record);

    int updateByPrimaryKey(Attraction record);

    List<Attraction> selectAll();
}