package com.leoren.play.dao;

import com.leoren.play.pojo.Store;
import org.codehaus.jackson.map.Serializers;

import java.util.List;

public interface StoreMapper extends BaseMapper<Store> {
    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);

    List<Store> selectAll();

    List<Store> getAll();
}