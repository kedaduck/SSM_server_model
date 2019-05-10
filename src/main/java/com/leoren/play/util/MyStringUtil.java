package com.leoren.play.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MyStringUtil
 * @Auther Leoren
 * @Date 2019/4/19 17:55
 * @Desc :
 * @Version v1.0
 **/

public class MyStringUtil {

    public static List<String> AssembleStringList(String str){
        List<String> list = new ArrayList<>();
        String[] strs = str.split(";");
        for(int i = 0; i < strs.length; i++){
            list.add(strs[i]);
        }
        return list;
    }


    public static String[] attractionStrs = new String[]{
            "景点与坐标",
            "博物馆",
            "自然与公园",
            "其它",
            "自然与公园"
    };
    public static String[] shoppingStrs = new String[]{
            "饮食",
            "啤酒厂",
            "购物",
            "农贸市场",
            "酒庄与葡萄园",
            "酿酒厂",
            "跳蚤市场与街头市集",
            "购物中心",
            "百货商场"
    };
    public static String[] happyStrs = new String[]{
            "动物园与水族馆",
            "水上活动与游乐园",
            "赌场",
            "休闲与游戏",
            "活动",
            "户外活动"
    };

    /**
     * 根据attraction  style str 判断 attraction  style
     * @param str
     * @return
     */
    public static int getAttractionType(String str){
        if(StringUtils.isBlank(str)){
            return -1;
        }
        for(int i = 0; i < happyStrs.length; i++){
            if(str.contains(happyStrs[i])){
                return 4;
            }
        }
        for(int i = 0; i < shoppingStrs.length; i++){
            if(str.contains(shoppingStrs[i])){
                return 3;
            }
        }
        for(int i = 0; i < attractionStrs.length; i++){
            if(str.contains(attractionStrs[i])){
                return 0;
            }
        }
        return 0;

    }

}
