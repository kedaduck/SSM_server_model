package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.leoren.play.common.Const;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.controller.portal.FindPeopleController;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.dao.FindPeopleMapper;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.FindPeople;
import com.leoren.play.pojo.Store;
import com.leoren.play.pojo.User;
import com.leoren.play.service.IFindPeopleService;
import com.leoren.play.vo.FindPeopleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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
        return ServerResponse.createBySuccess(findPeopleVoList);
    }

    public PageList<FindPeople> findAllFindPeople(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<FindPeople> findPeopleList = mapper.getAll();
        List<FindPeopleVo> findPeopleVoList = new ArrayList<>();
        for(int i = 0; i < findPeopleList.size(); i++){
            findPeopleVoList.add(FindPeopleVo.AssembleFindPeopleVo(findPeopleList.get(i)));
        }
        PageList result = PageList.createSuccess(findPeopleVoList);
        return result;

    }

    public ServerResponse createPublish(Long userId, int findClass, String title, String detail, String fileName){
        FindPeople findPeople = new FindPeople();
        findPeople.setUserId(userId);
        findPeople.setTitle(title);
        findPeople.setText(detail);
        findPeople.setState(0);
        findPeople.setPicture(fileName);
        findPeople.setPublishTime(new Date());
        int count = mapper.insert(findPeople);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("发布失败");
        }
        return ServerResponse.createBySuccessMessage("发布成功");

    }

    public ServerResponse changeFindPeopleState(Long id){
        FindPeople findPeople = mapper.selectByPrimaryKey(id);
        if(findPeople == null){
            return ServerResponse.createByErrorMessage("没有此条信息,更改状态出错");
        }
        findPeople.setEndTime(new Date());
        findPeople.setState(1);
        int count = mapper.updateByPrimaryKey(findPeople);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("改变状态失败");
        }
        return ServerResponse.createBySuccessMessage("改变成功");
    }

    public ServerResponse deleteItem(Long id){
        FindPeople findPeople = mapper.selectByPrimaryKey(id);
        if(findPeople == null){
            return ServerResponse.createByErrorMessage("没有此信息,删除失败");
        }
        int count = mapper.deleteByPrimaryKey(id);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("删除失败");
        }
        return ServerResponse.createBySuccessMessage("删除成功");
    }


}
