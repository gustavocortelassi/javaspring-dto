package com.Exemplo.ExemploBo.DTO;

import com.Exemplo.ExemploBo.model.User;

public class UserDTO {
    
    private Long id;
    private Long name;

    public UserDTO(User entity) {
    }

    public UserDTO(Long id, Long name) {
        this.id = id;
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getName() {
        return name;
    }
    public void setName(Long name) {
        this.name = name;
    }    
}

