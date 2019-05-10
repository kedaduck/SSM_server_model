package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Auther Leoren
 * @Date 2019/3/4 20:24
 * @Desc : 用户的Controller
 * @Version v1.0
 **/

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    public IUserService iUserService;

    /**
     * 用户登录方法
     * @param type
     * @param userinfo
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse login(String username, String password){
        return iUserService.login(username, password);
    }

    /**
     * 用户注册方法
     * @param type
     * @param userinfo
     * @param password
     * @return
     */
    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse register(String username, String password){
        return iUserService.register(username, password);
    }







}
