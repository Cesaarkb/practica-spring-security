package com.cesar.spring_security_1er_implementacion.repository;

import com.cesar.spring_security_1er_implementacion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long> {

    Optional<User> findByUsername(String username);
}
