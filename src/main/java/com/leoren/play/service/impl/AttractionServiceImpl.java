package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leoren.play.common.Const;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.AttractionMapper;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.User;
import com.leoren.play.service.IAttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;

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

    public PageList<Attraction> findAllAttraction(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Attraction> userList = mapper.getAllUser();
        PageInfo<Attraction> pageInfo = new PageInfo(userList);
        PageList result = PageList.createSuccess(userList);
        return result;

    }

    public ServerResponse addAttraction(String name, String address, String fileName){
        Attraction attraction = new Attraction();
        attraction.setPicture(fileName);
        attraction.setAttractioname(name);
        attraction.setText(address);
        int count = mapper.insert(attraction);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("增加失败");
        }
        return ServerResponse.createBySuccessMessage("增加成功");
    }

    public ServerResponse deleteAttraction(Integer id){
        Attraction attraction = mapper.selectByPrimaryKey(id);
        if(attraction == null){
            return ServerResponse.createByErrorMessage("没有此信息，请刷新页面后重试");
        }
        int count = mapper.deleteByPrimaryKey(id);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");


    }

}
