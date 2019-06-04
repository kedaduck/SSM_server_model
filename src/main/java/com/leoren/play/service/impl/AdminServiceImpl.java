package com.leoren.play.service.impl;

import com.google.common.collect.Lists;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.UserMapper;
import com.leoren.play.pojo.User;
import com.leoren.play.service.IAdminService;
import com.leoren.play.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AdminServiceImpl
 * @Auther Leoren
 * @Date 2019/6/4 19:37
 * @Desc :
 * @Version v1.0
 **/

@Service("iAdminService")
public class AdminServiceImpl implements IAdminService {


    @Autowired
    private UserMapper userMapper;

    public ServerResponse login(String username, String password){
        User user = userMapper.selectByUsername(username);
        if(user == null){
            return ServerResponse.createByErrorMessage("没有此用户");
        }
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        if(!md5Password.equals(user.getPassword())){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        return ServerResponse.createBySuccess("登录成功", user);
    }

    public ServerResponse findAllUser(int pageNum, int pageSize){
        List<User> userList = userMapper.findAll();
        if(userList == null || userList.size() <= 0){
            return ServerResponse.createByErrorMessage("没有用户");
        }
        return ServerResponse.createBySuccess(userList);
    }

}
