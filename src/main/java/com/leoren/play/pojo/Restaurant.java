package com.leoren.play.pojo;

public class Restaurant {
    private Integer id;

    private String name;

    private String foodname;

    private String picture;

    private Long price;

    private String text;

    public Restaurant(Integer id, String name, String foodname, String picture, Long price, String text) {
        this.id = id;
        this.name = name;
        this.foodname = foodname;
        this.picture = picture;
        this.price = price;
        this.text = text;
    }

    public Restaurant() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname == null ? null : foodname.trim();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}