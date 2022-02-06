package com.dailycodebuffer.entity.relations.repo;

import com.dailycodebuffer.entity.relations.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Long> {
}
