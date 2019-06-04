package com.leoren.play.service.impl;

import com.leoren.play.common.Const;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.AttractionMapper;
import com.leoren.play.dao.HotelMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.Hotel;
import com.leoren.play.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName HotelServiceImpl
 * @Auther Leoren
 * @Date 2019/5/19 10:22
 * @Desc :
 * @Version v1.0
 **/
@Service("iHotelService")
public class HotelServiceImpl implements IHotelService {

    @Autowired
    private HotelMapper mapper;

    public ServerResponse findAll(){
        List<Hotel> hotelList = mapper.selectAll();
        if(hotelList == null || hotelList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有此类信息");
        }
        for(int i = 0; i < hotelList.size(); i++){
            hotelList.get(i).setPicture(Const.ftpServerUrl + hotelList.get(i).getPicture());
        }
        return ServerResponse.createBySuccess(hotelList);
    }

}
