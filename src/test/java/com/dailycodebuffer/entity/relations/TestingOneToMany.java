package com.dailycodebuffer.entity.relations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.Order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.dailycodebuffer.entity.relations.entity.OrderItem;
import com.dailycodebuffer.entity.relations.entity.Orders;
import com.dailycodebuffer.entity.relations.repo.ItemRepository;
import com.dailycodebuffer.entity.relations.repo.OrderRepo;

@SpringBootTest
public class TestingOneToMany {
	
	  @Autowired private OrderRepo orderRepo;
	  
	  @Autowired private ItemRepository itemRepository;

	  @Autowired
	  private EntityManagerFactory factory;
	  @Test
	  //@Transactional
	  public void addOrder(){
	  
		 // String jpql  = "select c from OrderItem c";

		  
		  
		  EntityManager entityManager = factory.createEntityManager();
		  entityManager.getTransaction().begin();
		  var order = entityManager.find(Order.class, 30l);
		  
		  System.err.println(order);
		  //entityManager.detach(oi);
		  
		  entityManager.getTransaction().commit();
		  
		  
			/*
			 * EntityTransaction et = entityManager.getTransaction(); et.begin();
			 * entityManager.persist(order);
			 * 
			 * et.commit();
			 */
		  
		  
		  //entityManager.close();
		  
			/*
			 * TypedQuery<OrderItem> query =
			 * entityManager.createQuery(jpql,OrderItem.class);
			 * 
			 * List<OrderItem> list = query.getResultList();
			 */
		  
		  //System.err.println(list);
		
		


	  }
	  
	  
	 

}
