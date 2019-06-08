package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leoren.play.common.Const;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.dao.RestaurantMapper;
import com.leoren.play.dao.StoreMapper;
import com.leoren.play.pojo.Restaurant;
import com.leoren.play.pojo.Store;
import com.leoren.play.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StoreServiceImpl
 * @Auther Leoren
 * @Date 2019/5/19 10:24
 * @Desc :
 * @Version v1.0
 **/
@Service("iStoreService")
public class StoreServiceImpl implements IStoreService {

    @Autowired
    private StoreMapper mapper;


    public ServerResponse findAll(){
        List<Store> storeList = mapper.selectAll();
        if(storeList == null || storeList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有此类信息");
        }
        for(int i = 0; i < storeList.size(); i++){
            storeList.get(i).setPicture(Const.ftpServerUrl + storeList.get(i).getPicture());
        }
        return ServerResponse.createBySuccess(storeList);
    }

    public PageList<Store> findAllStore(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Store> userList = mapper.getAll();
        PageInfo<Store> pageInfo = new PageInfo(userList);
        PageList result = PageList.createSuccess(userList);
        return result;

    }

}
