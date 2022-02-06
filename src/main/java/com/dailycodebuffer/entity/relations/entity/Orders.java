package com.dailycodebuffer.entity.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Orders(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "order",cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    //@JoinColumn(name="fk_clm")
    private List<OrderItem> list;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
