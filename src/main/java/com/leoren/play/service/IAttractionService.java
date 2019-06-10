package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.Attraction;

/**
 * @ClassName IAttractionService
 * @Auther Leoren
 * @Date 2019/5/19 10:23
 * @Desc :
 * @Version v1.0
 **/
public interface IAttractionService{

    ServerResponse findAll();

    PageList<Attraction> findAllAttraction(int pageNum, int pageSize);

    ServerResponse addAttraction(String name, String address, String fileName);

    ServerResponse deleteAttraction(Integer id);
}
