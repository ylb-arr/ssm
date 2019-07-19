package com.qf.service;

import com.qf.pojo.Item;
import com.qf.util.PageInfo;

/**
 * item的Service层接口
 */
public interface ItemService {
    // 分页查询商品信息
    PageInfo<Item> findItemByNameLikeAndLimit(String name, Integer page, Integer size);
}
