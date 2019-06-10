package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leoren.play.common.Const;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.AttractionMapper;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.dao.RestaurantMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.Hotel;
import com.leoren.play.pojo.Restaurant;
import com.leoren.play.pojo.Store;
import com.leoren.play.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RestaurantServiceImpl
 * @Auther Leoren
 * @Date 2019/5/19 10:22
 * @Desc :
 * @Version v1.0
 **/

@Service("iRestaurantService")
public class RestaurantServiceImpl implements IRestaurantService {
    @Autowired
    private RestaurantMapper mapper;

    public ServerResponse findAll(){
        List<Restaurant> restaurantList = mapper.selectAll();
        if(restaurantList == null || restaurantList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有此类信息");
        }
        for(int i = 0; i < restaurantList.size(); i++){
            restaurantList.get(i).setPicture(Const.ftpServerUrl + restaurantList.get(i).getPicture());
        }
        return ServerResponse.createBySuccess(restaurantList);
    }

    public PageList<Restaurant> findAllRestaurant(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Restaurant> userList = mapper.getAll();
        PageInfo<Restaurant> pageInfo = new PageInfo(userList);
        PageList result = PageList.createSuccess(userList);
        return result;

    }

    public ServerResponse addRestaurant(String name, String address, String foodName, Integer price, String fileName){
        Restaurant restaurant = new Restaurant();
        restaurant.setPicture(fileName);
        restaurant.setName(name);
        restaurant.setText(address);
        restaurant.setPrice(Long.valueOf(price));
        restaurant.setFoodname(fileName);
        int count = mapper.insert(restaurant);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("增加失败");
        }
        return ServerResponse.createBySuccessMessage("增加成功");
    }

    public ServerResponse deleteRestaurant(Integer id){
        Restaurant restaurant = mapper.selectByPrimaryKey(id);
        if(restaurant == null){
            return ServerResponse.createByErrorMessage("没有此信息，请刷新页面后重试");
        }
        int count = mapper.deleteByPrimaryKey(id);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");


    }

}
