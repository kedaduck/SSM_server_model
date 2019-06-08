package com.leoren.play.query;

/**
 * @ClassName UserQuery
 * @Auther Leoren
 * @Date 2019/6/4 20:43
 * @Desc :
 * @Version v1.0
 **/

public class UserQuery extends BaseQuery{

    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
