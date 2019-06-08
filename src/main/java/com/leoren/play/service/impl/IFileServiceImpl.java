package com.leoren.play.service.impl;

import com.leoren.play.service.IFileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * @ClassName IFileServiceImpl
 * @Auther Leoren
 * @Date 2019/6/7 10:34
 * @Desc :
 * @Version v1.0
 **/

@Service("iFileService")
public class IFileServiceImpl implements IFileService {


    public String upload(MultipartFile file, String path){
        String fileName = file.getOriginalFilename();
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
        File fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);//赋予写权限
            fileDir.mkdirs();
        }
        File targetFile = new File(path, uploadFileName);
        try {
            file.transferTo(targetFile);
            CopyFile(targetFile, new File("E:\\Leoren\\DING\\mysql" + uploadFileName));
//            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
        } catch (IOException e) {
            return null;
        }
        return targetFile.getName();
    }

    private static void CopyFile(File file, File newFile){
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        try {
            in= new BufferedInputStream(new FileInputStream(file));
            //写入相应的文件
            out = new BufferedOutputStream(new FileOutputStream(newFile));
            //读取数据
            //一次性取多少字节
            byte[] bytes = new byte[2048];
            //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
            int n = -1;
            //循环取出数据
            while ((n = in.read(bytes,0,bytes.length)) != -1) {
                //转换成字符串
                String str = new String(bytes,0,n,"UTF-8");
                System.out.println(str);
                //写入相关文件
                out.write(bytes, 0, n);
            }
            //清楚缓存
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //关闭流
                in.close();
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
