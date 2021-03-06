package com.leoren.play.service;

import com.leoren.play.common.PageList;
import com.leoren.play.query.BaseQuery;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName BaseService
 * @Auther Leoren
 * @Date 2019/6/4 20:05
 * @Desc :
 * @Version v1.0
 **/
public interface IBaseService<T> {

    /**
     * 添加
     * @param t
     */
    public void add(T t);

    /**
     * 修改
     * @param t
     */
    public void update(T t);

    /**
     * 删除
     * @param id
     */
    public void delete(Serializable id);

    /**
     * 根据主键查询
     * @param id
     */
    public T getOne(Serializable id);

    /**
     * 查询所有
     * @return
     */
    public List<T> getAll();

    /**
     * 条件分页查询
     * @param query
     * @return
     */
    public PageList<T> getByQuery(BaseQuery query);


}
