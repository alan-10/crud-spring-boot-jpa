package com.crudProject.crud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudProject.crud.entities.Order;
import com.crudProject.crud.services.OrderService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/order")
public class OerderRepository {
	
	@Autowired
	OrderService service;

	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> orders = this.service.findAll();
		return ResponseEntity.ok().body(orders);	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order order = this.service.findBYId(id);
		
		return ResponseEntity.ok().body(order);
	}
	
	
}
