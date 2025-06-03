package com.cesar.spring_security_1er_implementacion.service;

import com.cesar.spring_security_1er_implementacion.model.User;

import java.util.Optional;

public interface UserService {
    User createUser(User user);

    Optional<User> getUser(long id);
}
