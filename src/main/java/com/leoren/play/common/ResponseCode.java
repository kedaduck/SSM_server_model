package com.leoren.play.common;

/**
 * @ClassName ResponseCode
 * @Auther Leoren
 * @Date 2019/3/4 20:10
 * @Desc : 服务器响应的各种状态码
 * @Version v1.0
 **/

public enum  ResponseCode {

    SUCCESS(0, "SUCCESS"),
    ERROR(1, "ERROR"),
    NEED_LOGIN(10, "NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");


    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
