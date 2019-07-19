package com.qf.mapper;

import com.qf.AcTests;
import com.qf.pojo.Item;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ItemMapperTest extends AcTests {

    @Autowired
    private ItemMapper itemMapper;

    @Test
    public void findCountByName() {
        Long count = itemMapper.findCountByName(null);
        System.out.println(count);
    }

    @Test
    public void findItemByNameLikeAndLimit() {
        List<Item> list = itemMapper.findItemByNameLikeAndLimit(null, 0, 5);

        for (Item item : list) {
            System.out.println(item);
        }
    }
}