package com.leoren.play.service.impl;

import com.leoren.play.common.Const;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.controller.portal.FindPeopleController;
import com.leoren.play.dao.FindPeopleMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.FindPeople;
import com.leoren.play.service.IFindPeopleService;
import com.leoren.play.vo.FindPeopleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FindPeopleServiceImpl
 * @Auther Leoren
 * @Date 2019/5/19 11:32
 * @Desc :
 * @Version v1.0
 **/

@Service("iFindPeopleService")
public class FindPeopleServiceImpl implements IFindPeopleService {

    @Autowired
    private FindPeopleMapper mapper;


    public ServerResponse findAll(){
        List<FindPeople> findPeopleList = mapper.selectAll();
        if(findPeopleList == null || findPeopleList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有此类信息");
        }
        List<FindPeopleVo> findPeopleVoList = new ArrayList<>();
        for(int i = 0; i < findPeopleList.size(); i++){
            findPeopleVoList.add(FindPeopleVo.AssembleFindPeopleVo(findPeopleList.get(i)));
        }
        return ServerResponse.createBySuccess(findPeopleList);
    }


}
