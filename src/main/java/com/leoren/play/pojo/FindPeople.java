package com.leoren.play.pojo;

import java.util.Date;

public class FindPeople {
    private Long id;

    private String title;

    private String text;

    private String picture;

    private Date publishTime;

    private Date endTime;

    private Integer state;

    private Long userId;

    public FindPeople(Long id, String title, String text, String picture, Date publishTime, Date endTime, Integer state, Long userId) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.picture = picture;
        this.publishTime = publishTime;
        this.endTime = endTime;
        this.state = state;
        this.userId = userId;
    }

    public FindPeople() {
        super();
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
        this.title = title == null ? null : title.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}