package com.leoren.play.controller.backend;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.*;
import com.leoren.play.query.BaseQuery;
import com.leoren.play.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

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

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IAttractionService iAttractionService;

    @Autowired
    private IRestaurantService iRestaurantService;

    @Autowired
    private IHotelService iHotelService;

    @Autowired
    private IStoreService iStoreService;

    @Autowired
    private IFindPeopleService iFindPeopleService;

    @RequestMapping("login.do")
    @ResponseBody
    public ServerResponse login(String username, String password){
        return iAdminService.login(username, password);
    }


    @RequestMapping("find_all_user.do")
    @ResponseBody
    public PageList<User> findAllUser(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iUserService.findAllUser(pageNum, pageSize);
    }

    @RequestMapping("find_all_attraction.do")
    @ResponseBody
    public PageList<Attraction> findAllAttraction(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iAttractionService.findAllAttraction(pageNum, pageSize);
    }

    @RequestMapping("find_all_hotel.do")
    @ResponseBody
    public PageList<Hotel> findAllHotel(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iHotelService.findAllHotel(pageNum, pageSize);
    }

    @RequestMapping("find_all_restaurant.do")
    @ResponseBody
    public PageList<Restaurant> findAllRestaurant(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iRestaurantService.findAllRestaurant(pageNum, pageSize);
    }

    @RequestMapping("find_all_store.do")
    @ResponseBody
    public PageList<Store> findAllStore(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iStoreService.findAllStore(pageNum, pageSize);
    }

    @RequestMapping("find_all_find_people.do")
    @ResponseBody
    public PageList<FindPeople> findAllFindPeople(int pageNum, int pageSize, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iFindPeopleService.findAllFindPeople(pageNum, pageSize);
    }

    @RequestMapping("change_find_people_state.do")
    @ResponseBody
    public ServerResponse changeFindPeopleState(Long id, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iFindPeopleService.changeFindPeopleState(id);
    }

    @RequestMapping("reset_user_password.do")
    @ResponseBody
    public ServerResponse resetUserPassword(Integer id, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iUserService.resetUserPassword(id);
    }




}
