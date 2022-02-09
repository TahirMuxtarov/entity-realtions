package com.dailycodebuffer.entity.relations.controller;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import com.dailycodebuffer.entity.relations.repo.ItemRepository;
import com.dailycodebuffer.entity.relations.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemService itemService;
    @GetMapping
    public List<OrderItem> getAllItems(){
        return itemService.getAllItems();
    }


}
