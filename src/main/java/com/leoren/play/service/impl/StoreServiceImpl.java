package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leoren.play.common.Const;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.dao.RestaurantMapper;
import com.leoren.play.dao.StoreMapper;
import com.leoren.play.pojo.Hotel;
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


    public ServerResponse addStore(String name, String address, Integer price, String storeName, String fileName){
        Store store = new Store();
        store.setPicture(fileName);
        store.setName(name);
        store.setText(address);
        store.setPrice(Long.valueOf(price));
        store.setStorename(storeName);
        int count = mapper.insert(store);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("增加失败");
        }
        return ServerResponse.createBySuccessMessage("增加成功");
    }

    public ServerResponse deleteStore(Integer id){
        Store store = mapper.selectByPrimaryKey(id);
        if(store == null){
            return ServerResponse.createByErrorMessage("没有此信息，请刷新页面后重试");
        }
        int count = mapper.deleteByPrimaryKey(id);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");


    }

}
