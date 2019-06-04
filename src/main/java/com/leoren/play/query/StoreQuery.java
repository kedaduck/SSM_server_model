package com.leoren.play.query;

import org.codehaus.jackson.map.Serializers;

/**
 * @ClassName StoreQuery
 * @Auther Leoren
 * @Date 2019/6/4 19:56
 * @Desc :
 * @Version v1.0
 **/

public class StoreQuery extends BaseQuery {

    private String name;
    private String storeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
}
