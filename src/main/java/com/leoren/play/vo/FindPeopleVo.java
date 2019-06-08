package com.leoren.play.vo;

import com.leoren.play.common.Const;
import com.leoren.play.pojo.FindPeople;
import com.leoren.play.util.DateParseUtil;

import java.util.Date;

/**
 * @ClassName FindPeopleVo
 * @Auther Leoren
 * @Date 2019/5/19 11:42
 * @Desc :
 * @Version v1.0
 **/

public class FindPeopleVo {

    private Long id;

    private String title;

    private String text;

    private String picture;

    private String publishTime;

    private String endTime;

    private String state;

    private Long userId;


    public static FindPeopleVo AssembleFindPeopleVo(FindPeople people){
        FindPeopleVo vo = new FindPeopleVo();
        vo.setId(people.getId());
        vo.setText(people.getText());
        vo.setTitle(people.getTitle());
        vo.setPicture(Const.ftpServerUrl + people.getPicture());
        if(people.getEndTime() != null){
            vo.setEndTime(DateParseUtil.dateToString(people.getEndTime()));
        }
        if(people.getPublishTime() != null){
            vo.setPublishTime(DateParseUtil.dateToString(people.getPublishTime()));
        }
        vo.setUserId(people.getUserId());
        if(people.getState() == 0){
            vo.setState("未找到");
        }else {
            vo.setState("已找到");
        }
        System.out.println(vo.toString());
        return vo;
    }

    @Override
    public String toString() {
        return "FindPeopleVo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", picture='" + picture + '\'' +
                ", publishTime='" + publishTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", state=" + state +
                ", userId=" + userId +
                '}';
    }

    public FindPeopleVo() {
    }

    public FindPeopleVo(Long id, String title, String text, String picture, String publishTime, String endTime, String state, Long userId) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.picture = picture;
        this.publishTime = publishTime;
        this.endTime = endTime;
        this.state = state;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
