package com.dailycodebuffer.entity.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemName;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ertert")
    private Orders order;

    /*public OrderItem(String itemName, Orders order) {
        this.itemName = itemName;
        this.order = order;
    }*/

    public OrderItem(String itemName) {
        this.itemName = itemName;
    }
}
