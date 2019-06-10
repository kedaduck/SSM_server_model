package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.User;

/**
 * @ClassName IUserService
 * @Auther Leoren
 * @Date 2019/3/4 20:25
 * @Desc : 用户Service
 * @Version v1.0
 **/
public interface IUserService {

    ServerResponse login(String username, String password);
    ServerResponse register(String username, String password);
    PageList<User> findAllUser(int pageNum, int pageSize);
    ServerResponse changePassword(Integer userId, String password);
    ServerResponse changeUsername(Integer userId, String username);
    ServerResponse resetUserPassword(Integer userId);
    ServerResponse deleteUser(Integer userId);

}

