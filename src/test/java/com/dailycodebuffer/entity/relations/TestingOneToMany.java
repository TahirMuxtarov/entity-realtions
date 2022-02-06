package com.dailycodebuffer.entity.relations;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import com.dailycodebuffer.entity.relations.entity.Orders;
import com.dailycodebuffer.entity.relations.repo.ItemRepository;
import com.dailycodebuffer.entity.relations.repo.OrderRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TestingOneToMany {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ItemRepository itemRepository;
    @Test
    //@Transactional
    //@Modifying
    public void addOrder(){

        Orders order = orderRepo.findById(25l).get();
        System.out.println(order);
        System.out.println(order.getList());
       }








    }

