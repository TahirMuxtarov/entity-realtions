package com.dailycodebuffer.entity.relations.repo;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepository extends JpaRepository<OrderItem,Long> {
    @Query("select i from OrderItem i join fetch i.order where i.id > 890 ")
    public List<OrderItem> geOrderItemsErtertBiggerThan26();
}
