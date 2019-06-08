package com.leoren.play.controller.portal;

import com.leoren.play.common.ServerResponse;
import com.leoren.play.service.IFileService;
import com.leoren.play.service.IFindPeopleService;
import com.leoren.play.util.PropertiesUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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

    @Autowired
    private IFileService iFileService;

    @RequestMapping("find_all.do")
    @ResponseBody
    public ServerResponse findAll(){
        return iFindPeopleService.findAll();
    }

    @RequestMapping("create_publish.do")
    @ResponseBody
    public ServerResponse createPublish(@RequestParam(value = "upload_file", required = false) MultipartFile file, Long userId, String title, String detail, int findClass){
        if(file == null){
            return ServerResponse.createByErrorMessage("发布消失失败，必须添加照片才能够发送");
        }
        String path = PropertiesUtil.getProperty("upload.file.path");
        String targetFileName = iFileService.upload(file, path);
        if(StringUtils.isBlank(targetFileName)){
            return ServerResponse.createByErrorMessage("上传图片失败, 请稍后重试");
        }
        ServerResponse response = iFindPeopleService.createPublish(userId, findClass, title, detail, targetFileName);
        return response;
    }

}
