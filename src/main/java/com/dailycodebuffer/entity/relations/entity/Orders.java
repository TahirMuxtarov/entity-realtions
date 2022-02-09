package com.dailycodebuffer.entity.relations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
	public Orders(String name) {
        this.name = name;
    }

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Version
    private Long version;

    
    public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}


	@OneToMany(mappedBy = "order",cascade = CascadeType.PERSIST)
    //@JoinColumn(name="fk_clm")
    private List<OrderItem> list;

  

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", version=" + version + ", list=" + list + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OrderItem> getList() {
		return list;
	}

	public void setList(List<OrderItem> list) {
		this.list = list;
	}




}
