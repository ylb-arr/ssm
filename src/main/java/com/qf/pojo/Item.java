package com.qf.pojo;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  商品表对应的实体类
 */
@Data
public class Item {

    //id
    public Long id;
    // 商品名称
    private String name;
    // 商品价格
    private BigDecimal price;
    // 商品的生产日期.
    private Date productionDate;
    // 商品的描述
    private String description;
    // 商品的图片
    private String pic;
    // 商品的创建时间
    private Date created;
}
