package com.Exemplo.ExemploBo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Exemplo.ExemploBo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
