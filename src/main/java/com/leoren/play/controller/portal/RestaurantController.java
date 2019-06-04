package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName RestaurantController
 * @Auther Leoren
 * @Date 2019/5/19 10:21
 * @Desc :
 * @Version v1.0
 **/

@Controller
@RequestMapping("/restaurant/")
public class RestaurantController {

    @Autowired
    private IRestaurantService iRestaurantService;


    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iRestaurantService.findAll();
    }


}
