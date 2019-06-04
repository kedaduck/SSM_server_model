package com.leoren.play.dao;

import com.leoren.play.pojo.Restaurant;

import java.util.List;

public interface RestaurantMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    Restaurant selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);

    List<Restaurant> selectAll();
}