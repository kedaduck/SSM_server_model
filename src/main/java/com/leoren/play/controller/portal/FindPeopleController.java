package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IFindPeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName FindPeopleController
 * @Auther Leoren
 * @Date 2019/5/19 11:31
 * @Desc :
 * @Version v1.0
 **/
@Controller
@RequestMapping("/find_people/")
public class FindPeopleController {


    @Autowired
    private IFindPeopleService iFindPeopleService;

    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iFindPeopleService.findAll();
    }

}
