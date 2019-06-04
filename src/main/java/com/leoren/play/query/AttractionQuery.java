package com.leoren.play.query;

/**
 * @ClassName AttractionQuery
 * @Auther Leoren
 * @Date 2019/6/4 19:55
 * @Desc :
 * @Version v1.0
 **/

public class AttractionQuery extends BaseQuery {

    private String attractionName;
    private String text;

    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
