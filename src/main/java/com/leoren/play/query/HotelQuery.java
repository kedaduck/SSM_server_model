package com.leoren.play.query;

/**
 * @ClassName HotelQuery
 * @Auther Leoren
 * @Date 2019/6/4 19:55
 * @Desc :
 * @Version v1.0
 **/

public class HotelQuery extends BaseQuery {

    private String type;
    private String text;
    private String name;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
