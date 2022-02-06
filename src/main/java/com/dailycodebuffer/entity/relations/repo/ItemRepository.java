package com.dailycodebuffer.entity.relations.repo;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<OrderItem,Long> {
}
