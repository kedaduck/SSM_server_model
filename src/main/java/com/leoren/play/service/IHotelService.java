package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.Hotel;

/**
 * @ClassName IHotelService
 * @Auther Leoren
 * @Date 2019/5/19 10:22
 * @Desc :
 * @Version v1.0
 **/
public interface IHotelService  {

    ServerResponse findAll();

    PageList<Hotel> findAllHotel(int pageNum, int pageSize);

    ServerResponse addHotel(String name, String address, String type, Integer price, String fileName);

    ServerResponse deleteHotel(Integer id);

}
