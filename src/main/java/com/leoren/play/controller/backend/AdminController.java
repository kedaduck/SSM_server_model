package com.leoren.play.controller.backend;

import com.leoren.play.common.PageList;
import com.leoren.play.common.ServerResponse;
import com.leoren.play.pojo.*;
import com.leoren.play.query.BaseQuery;
import com.leoren.play.service.*;
import com.leoren.play.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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

    @Autowired
    private IFileService iFileService;

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

    @RequestMapping("delete_user.do")
    @ResponseBody
    public ServerResponse deleteUser(Integer id, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iUserService.deleteUser(id);
    }

    @RequestMapping("delete_find_people.do")
    @ResponseBody
    public ServerResponse deleteFindPeople(Long id, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iFindPeopleService.deleteItem(id);
    }

    @RequestMapping("add_attraction.do")
    @ResponseBody
    public ServerResponse addAttraction(String attractionName, String attractionAddress, @RequestParam(value = "attractionImg", required = false) MultipartFile file, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        if(file == null){
            return ServerResponse.createByErrorMessage("发布消失失败，必须添加图片才能够添加");
        }
        String path = PropertiesUtil.getProperty("upload.file.path");
        String targetFileName = iFileService.upload(file, path);
        return iAttractionService.addAttraction(attractionName, attractionAddress, targetFileName);
    }

    @RequestMapping("delete_attraction.do")
    @ResponseBody
    public ServerResponse deleteAttraction(Integer attractionId, HttpServletResponse  response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iAttractionService.deleteAttraction(attractionId);
    }

    @RequestMapping("add_hotel.do")
    @ResponseBody
    public ServerResponse addHotel(String name, String address, String type, Integer price, @RequestParam(value = "hotelImg", required = false) MultipartFile file, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        if(file == null){
            return ServerResponse.createByErrorMessage("发布消失失败，必须添加图片才能够添加");
        }
        String path = PropertiesUtil.getProperty("upload.file.path");
        String targetFileName = iFileService.upload(file, path);
        return iHotelService.addHotel(name, address, type, price, targetFileName);
    }

    @RequestMapping("delete_hotel.do")
    @ResponseBody
    public ServerResponse deleteHotel(Integer hotelId, HttpServletResponse  response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iHotelService.deleteHotel(hotelId);
    }

    @RequestMapping("add_restaurant.do")
    @ResponseBody
    public ServerResponse addRestaurant(String name, String address, String foodName, Integer price, @RequestParam(value = "restaurantImg", required = false) MultipartFile file, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        if(file == null){
            return ServerResponse.createByErrorMessage("发布消失失败，必须添加图片才能够添加");
        }
        String path = PropertiesUtil.getProperty("upload.file.path");
        String targetFileName = iFileService.upload(file, path);
        return iRestaurantService.addRestaurant(name, address, foodName, price, targetFileName);
    }

    @RequestMapping("delete_restaurant.do")
    @ResponseBody
    public ServerResponse deleteRestaurant(Integer restaurantId, HttpServletResponse  response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iRestaurantService.deleteRestaurant(restaurantId);
    }

    @RequestMapping("add_store.do")
    @ResponseBody
    public ServerResponse addStore(String name, String detail, Integer price, String storeName, @RequestParam(value = "storeImg", required = false) MultipartFile file, HttpServletResponse response){
        response.addHeader("Access-Control-Allow-Origin","*");
        if(file == null){
            return ServerResponse.createByErrorMessage("发布消失失败，必须添加图片才能够添加");
        }
        String path = PropertiesUtil.getProperty("upload.file.path");
        String targetFileName = iFileService.upload(file, path);
        return iStoreService.addStore(name, detail, price, storeName, targetFileName);
    }

    @RequestMapping("delete_store.do")
    @ResponseBody
    public ServerResponse deleteStore(Integer storeId, HttpServletResponse  response){
        response.addHeader("Access-Control-Allow-Origin","*");
        return iStoreService.deleteStore(storeId);
    }






}
