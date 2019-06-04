package com.leoren.play.pojo;

public class Attraction {
    private Integer id;

    private String attractioname;

    private String text;

    private String picture;

    public Attraction(Integer id, String attractioname, String text, String picture) {
        this.id = id;
        this.attractioname = attractioname;
        this.text = text;
        this.picture = picture;
    }

    public Attraction() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttractioname() {
        return attractioname;
    }

    public void setAttractioname(String attractioname) {
        this.attractioname = attractioname == null ? null : attractioname.trim();
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
}