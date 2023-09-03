package com.guilhermeduarte.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermeduarte.api.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
