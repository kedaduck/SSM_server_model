package com.leoren.play.service;

import com.leoren.play.common.ServerResponse;

/**
 * @ClassName IAdminService
 * @Auther Leoren
 * @Date 2019/6/4 19:37
 * @Desc :
 * @Version v1.0
 **/
public interface IAdminService {


    ServerResponse login(String username, String password);

    ServerResponse findAllUser(int pageNum, int pageSize);

}
