package com.qf.service;

import com.qf.AcTests;
import com.qf.pojo.Item;
import com.qf.util.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ItemServiceTest extends AcTests {

    @Autowired
    private ItemService itemService;

    @Test
    public void findItemByNameLikeAndLimit() {
        PageInfo<Item> pageInfo = itemService.findItemByNameLikeAndLimit(null, 1, 10);

        System.out.println(pageInfo);

        for (Item item : pageInfo.getList()) {
            System.out.println(item);
        }
    }
}