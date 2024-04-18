package com.Exemplo.ExemploBo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Exemplo.ExemploBo.DTO.UserDTO;
import com.Exemplo.ExemploBo.model.User;
import com.Exemplo.ExemploBo.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired  
    private UserRepository repository;

    @Transactional
    public UserDTO findById(Long id){
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }
}
