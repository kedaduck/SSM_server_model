package com.leoren.play.common;

/**
 * @ClassName Const
 * @Auther Leoren
 * @Date 2019/3/5 8:43
 * @Desc :
 * @Version v1.0
 **/

public class Const {

    public static final String ftpServerUrl = "http://192.168.137.1:20004/";

    //普通用户登录方式
    public interface UserLoginType{
        public int USERNAME = 1;  //用户名登录
        public int PHONE = 2;  //手机号登录
        public int EMAIL = 3;  //email登录
    }

    //普通用户的各种身份
    public interface UserRole{
        public int FATHER = 1;  //父亲
        public int MOTHER = 2; //母亲
        public int GRANDFATHER = 3; //爷爷
        public int GRANDMOTHER = 4; //奶奶
        public int OTHER = 5; //其他
    }

    //用户性别
    public interface UserSex{
        public int DEFAULT = 0;  //未知
        public int MALE = 1;   //男
        public int FEMALE = 2;  //女

    }

    public interface InterQueryType{
        public int CITY = 1;
        public int PROVINCE = 2;
        public int COUNTRY = 3;
    }



}
