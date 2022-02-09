package com.dailycodebuffer.entity.relations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Order;

//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dailycodebuffer.entity.relations.repo.ItemRepository;
import com.dailycodebuffer.entity.relations.repo.OrderRepo;

@SpringBootApplication
public class EntityRelationsApplication {


	public static void main(String[] args) {
		SpringApplication.run(EntityRelationsApplication.class, args);

	}

}
