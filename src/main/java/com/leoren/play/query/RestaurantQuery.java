package com.leoren.play.query;

/**
 * @ClassName RestaurantQuery
 * @Auther Leoren
 * @Date 2019/6/4 19:55
 * @Desc :
 * @Version v1.0
 **/

public class RestaurantQuery extends BaseQuery {

    private String name;
    private String foodName;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
