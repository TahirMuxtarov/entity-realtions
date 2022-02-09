package com.dailycodebuffer.entity.relations.service;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import com.dailycodebuffer.entity.relations.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.Cacheable;
import java.util.List;

@Service

@Cacheable
public class ItemService {
    @Autowired

    private ItemRepository itemRepository;
    public List<OrderItem> getAllItems(){
        return itemRepository.findAll();
    }

}
