package com.leoren.play.service.impl;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.dao.UserMapper;
import com.leoren.play.pojo.User;
import com.leoren.play.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
