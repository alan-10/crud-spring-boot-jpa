package com.crudProject.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudProject.crud.entities.Order;
import com.crudProject.crud.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

	public List<Order> findAll() {
		return this.repository.findAll();
	}

	public Order findBYId(Long id) {
		Optional<Order> order = this.repository.findById(id);

		return order.get();
	}

}
