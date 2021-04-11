package com.mmall.dao;

import com.mmall.pojo.Cart;

public interface CartMapper { //接口，购物车
    int deleteByPrimaryKey(Integer id);//根据主键删除

    int insert(Cart record);//插入一个购物车

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}