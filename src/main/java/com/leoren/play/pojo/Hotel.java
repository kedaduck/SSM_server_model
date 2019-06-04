package com.leoren.play.pojo;

public class Hotel {
    private Integer id;

    private String type;

    private String text;

    private String picture;

    private Long price;

    private String name;

    public Hotel(Integer id, String type, String text, String picture, Long price, String name) {
        this.id = id;
        this.type = type;
        this.text = text;
        this.picture = picture;
        this.price = price;
        this.name = name;
    }

    public Hotel() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}