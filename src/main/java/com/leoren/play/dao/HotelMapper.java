package com.leoren.play.dao;

import com.leoren.play.pojo.Hotel;

import java.util.List;

public interface HotelMapper extends BaseMapper<Hotel>{
    int deleteByPrimaryKey(Integer id);

    int insert(Hotel record);

    int insertSelective(Hotel record);

    Hotel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hotel record);

    int updateByPrimaryKey(Hotel record);

    List<Hotel> selectAll();

    List<Hotel> getAll();
}