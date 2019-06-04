package com.leoren.play.service.impl;

import com.leoren.play.common.Const;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.AttractionMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.service.IAttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AttractionServiceImpl
 * @Auther Leoren
 * @Date 2019/5/19 10:23
 * @Desc :
 * @Version v1.0
 **/

@Service("iAttractionService")
public class AttractionServiceImpl implements IAttractionService {

    @Autowired
    private AttractionMapper mapper;





    public ServerResponse findAll(){
        List<Attraction> attractionList = mapper.selectAll();
        if(attractionList == null || attractionList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有此类信息");
        }
        for(int i = 0; i < attractionList.size(); i++){
            attractionList.get(i).setPicture(Const.ftpServerUrl + attractionList.get(i).getPicture());
        }
        return ServerResponse.createBySuccess(attractionList);
    }

}
