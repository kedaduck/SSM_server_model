package com.leoren.play.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.BaseMapper;
import com.leoren.play.dao.UserMapper;
import com.leoren.play.pojo.Store;
import com.leoren.play.pojo.User;
import com.leoren.play.service.IUserService;
import net.sf.jsqlparser.schema.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserServiceImpl
 * @Auther Leoren
 * @Date 2019/4/26 21:49
 * @Desc :
 * @Version v1.0
 **/

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ServerResponse login(String username, String password) {
        User user = userMapper.selectByUsername(username);
        if(user == null){
            return ServerResponse.createByErrorMessage("没有此用户");
        }
        if(user.getPassword().equals(password)){
            return ServerResponse.createBySuccess("登录成功", user);
        }else {
            return ServerResponse.createByErrorMessage("密码错误");
        }
    }

    public ServerResponse register(String username, String password){
        User user = userMapper.selectByUsername(username);
        if(user != null){
            return ServerResponse.createByErrorMessage("该用户已经存在");
        }
        User newUser = new User(username, password);
        int count = userMapper.insertSelective(newUser);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("注册失败，请稍后重试");
        }
        return ServerResponse.createBySuccess("注册成功");
    }

    public PageList<User> findAllUser(int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<User> userList = userMapper.getAllUser();
        PageInfo<User> pageInfo = new PageInfo(userList);
        PageList result = PageList.createSuccess(userList);
        return result;

    }

    public ServerResponse changeUsername(Integer userId, String username){
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null){
            return ServerResponse.createByErrorMessage("没有此用户");
        }
        user.setUsername(username);
        int count = userMapper.updateByPrimaryKey(user);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("更改用户名失败");
        }
        return ServerResponse.createBySuccessMessage("更改用户名成功");
    }

    public ServerResponse changePassword(Integer userId, String password){
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null){
            return ServerResponse.createByErrorMessage("没有此用户");
        }
        user.setPassword(password);
        int count = userMapper.updateByPrimaryKey(user);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("更改密码失败");
        }
        return ServerResponse.createBySuccessMessage("更改密码成功");
    }

    public ServerResponse resetUserPassword(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null){
            return ServerResponse.createByErrorMessage("没有此用户,重置失败");
        }
        user.setPassword("123456");
        int count = userMapper.updateByPrimaryKey(user);
        if(count <= 0){
            return ServerResponse.createByErrorMessage("重置密码失败");
        }
        return ServerResponse.createBySuccessMessage("重置密码成功");


    }

}
