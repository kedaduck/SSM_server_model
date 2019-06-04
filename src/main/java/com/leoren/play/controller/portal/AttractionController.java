package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IAttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName AttractionController
 * @Auther Leoren
 * @Date 2019/5/19 10:25
 * @Desc :
 * @Version v1.0
 **/

@Controller
@RequestMapping("/attraction/")
public class AttractionController {


    @Autowired
    private IAttractionService iAttractionService;


    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iAttractionService.findAll();
    }

}
