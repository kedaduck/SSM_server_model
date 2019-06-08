package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.Store;

/**
 * @ClassName IStoreService
 * @Auther Leoren
 * @Date 2019/5/19 10:24
 * @Desc :
 * @Version v1.0
 **/
public interface IStoreService {

    ServerResponse findAll();

    PageList<Store> findAllStore(int pageNum, int pageSize);
}
