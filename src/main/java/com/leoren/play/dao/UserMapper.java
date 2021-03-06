package com.leoren.play.dao;

import com.leoren.play.pojo.User;

import java.util.List;

public interface UserMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    List<User> findAll();

    List<User> getAllUser();
}