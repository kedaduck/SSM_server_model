package com.leoren.play.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具
 * @param <T>
 */
public class PageList<T> {

    private int code=0;
    private String msg;
    private int count; //总条数
    private List<T> data = new ArrayList(); //装前台当前页的数据
    //getter/setter方法...

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }

    public static PageList createSuccess(List list){
        PageList response = new PageList();
        response.code = 0;
        response.msg = "";
        response.count = list.size();
        response.data = list;
        return response;
    }

    public static PageList createError(String msg){
        PageList response = new PageList();
        response.code = -1;
        response.msg = msg;
        response.count = 0;
        response.data = new ArrayList();
        return response;
    }

}