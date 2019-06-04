package com.leoren.play.pojo;

public class Store {
    private Integer id;

    private String name;

    private String text;

    private String picture;

    private Long price;

    private String storename;

    public Store(Integer id, String name, String text, String picture, Long price, String storename) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.picture = picture;
        this.price = price;
        this.storename = storename;
    }

    public Store() {
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

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }
}