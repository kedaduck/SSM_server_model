package com.leoren.play.query;

/**
 * @ClassName BaseQuery
 * @Auther Leoren
 * @Date 2019/6/4 19:54
 * @Desc :
 * @Version v1.0
 **/

public class BaseQuery {

    private String keyword;//关键字
    private int page = 1;//页数
    private int limit = 10;//每页的条目数

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
