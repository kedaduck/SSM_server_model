package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.Restaurant;

/**
 * @ClassName IRestaurantService
 * @Auther Leoren
 * @Date 2019/5/19 10:21
 * @Desc :
 * @Version v1.0
 **/
public interface IRestaurantService  {

    ServerResponse findAll();

    PageList<Restaurant> findAllRestaurant(int pageNum, int pageSize);

    ServerResponse addRestaurant(String name, String address, String foodName, Integer price, String fileName);

    ServerResponse deleteRestaurant(Integer id);
}
