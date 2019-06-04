package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName StoreController
 * @Auther Leoren
 * @Date 2019/5/19 10:25
 * @Desc :
 * @Version v1.0
 **/
@Controller
@RequestMapping("/store/")
public class StoreController {

    @Autowired
    private IStoreService iStoreService;

    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iStoreService.findAll();
    }

}
