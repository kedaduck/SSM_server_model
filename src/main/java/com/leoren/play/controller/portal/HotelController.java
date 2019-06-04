package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HotelController
 * @Auther Leoren
 * @Date 2019/5/19 10:25
 * @Desc :
 * @Version v1.0
 **/

@Controller
@RequestMapping("/hotel/")
public class HotelController {

    @Autowired
    private IHotelService iHotelService;


    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iHotelService.findAll();
    }

}
