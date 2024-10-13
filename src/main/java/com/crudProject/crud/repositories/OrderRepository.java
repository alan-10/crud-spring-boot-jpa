package com.crudProject.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
