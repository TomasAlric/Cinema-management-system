package com.api.cinemamanagementsystem.dto;

import com.api.cinemamanagementsystem.models.Role;
import com.api.cinemamanagementsystem.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String name;

    private String lastName;

    private Instant birthDate;

    private String cpf;

    private String email;

    private Role role;

    public UserDTO(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.lastName = entity.getLastName();
        this.birthDate = entity.getBirthDate();
        this.cpf = entity.getCpf();
        this.email = entity.getEmail();
        this.role = entity.getRole();
    }
}
