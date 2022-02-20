package com.api.cinemamanagementsystem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Data
@Table(name = "tb_users")
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 4, max = 10)
    private String name;

    @NotBlank
    @Size(min = 4, max = 10)
    private String lastName;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant birthDate;

    @Column(unique = true)
    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @Email
    @NotBlank
    private String email;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
