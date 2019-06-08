package com.leoren.play.dao;

import com.leoren.play.pojo.Attraction;
import com.leoren.play.query.BaseQuery;

import java.util.List;

public interface AttractionMapper extends BaseMapper<Attraction> {
    int deleteByPrimaryKey(Integer id);

    int insert(Attraction record);

    int insertSelective(Attraction record);

    Attraction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Attraction record);

    int updateByPrimaryKey(Attraction record);

    List<Attraction> selectAll();

    List<Attraction> getAllUser();
}