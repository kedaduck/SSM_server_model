package com.leoren.play.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName IFileService
 * @Auther Leoren
 * @Date 2019/6/7 10:33
 * @Desc :
 * @Version v1.0
 **/
public interface IFileService {
    String upload(MultipartFile file, String path);
}
