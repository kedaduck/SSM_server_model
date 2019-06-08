package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.Attraction;
import com.leoren.play.pojo.FindPeople;

/**
 * @ClassName IFindPeopleService
 * @Auther Leoren
 * @Date 2019/5/19 11:32
 * @Desc :
 * @Version v1.0
 **/
public interface IFindPeopleService {

    ServerResponse findAll();

    PageList<FindPeople> findAllFindPeople(int pageNum, int pageSize);

    ServerResponse createPublish(Long userId, int findClass, String title, String detail, String fileName);

    ServerResponse changeFindPeopleState(Long id);

}
