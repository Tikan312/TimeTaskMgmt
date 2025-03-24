package com.application.time_and_task_management.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    @Getter
    @JsonProperty(value = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id")
    @SequenceGenerator(name = "user_id", sequenceName = "user_id", allocationSize = 1)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Getter
    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "e-mail", nullable = false)
    private String email;

    @Getter
    @Column(name = "password", nullable = false)
    private String password;

    @Getter
    @Column(name = "hashedPassword", nullable = false)
    private String hashedPassword;

    @Enumerated(EnumType.STRING)
    private UserRole role;

}
