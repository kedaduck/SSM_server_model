package com.leoren.play.controller.backend;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName AdminController
 * @Auther Leoren
 * @Date 2019/3/5 8:38
 * @Desc : 管理员用户Controller
 * @Version v1.0
 **/

@Controller
@RequestMapping("/admin/")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;

    @RequestMapping("login.do")
    @ResponseBody
    public ServerResponse login(String username, String password){
        return iAdminService.login(username, password);
    }


    @RequestMapping("findAllUser.do")
    @ResponseBody
    public ServerResponse findAllUser(int pageNum, int pageSize){
        return iAdminService.findAllUser(pageNum, pageSize);
    }




}
