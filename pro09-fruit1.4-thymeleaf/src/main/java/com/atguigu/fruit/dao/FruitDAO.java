package com.atguigu.fruit.dao;

import com.atguigu.fruit.pojo.Fruit;

import java.util.List;

/**
 * @author Davy
 */
public interface FruitDAO {
    //获取所有库存列表信息
    List<Fruit> getFruitList();
}
