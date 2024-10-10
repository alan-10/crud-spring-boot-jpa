package com.crudProject.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudProject.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
