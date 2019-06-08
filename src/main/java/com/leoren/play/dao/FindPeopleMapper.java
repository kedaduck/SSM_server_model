package com.leoren.play.dao;

import com.leoren.play.pojo.FindPeople;

import java.util.List;

public interface FindPeopleMapper extends BaseMapper<FindPeople> {
    int deleteByPrimaryKey(Long id);

    int insert(FindPeople record);

    int insertSelective(FindPeople record);

    FindPeople selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FindPeople record);

    int updateByPrimaryKey(FindPeople record);

    List<FindPeople> selectAll();

    List<FindPeople> getAll();
}