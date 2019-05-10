package com.leoren.play.service;

import com.leoren.play.common.ServerResponse;

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

}

