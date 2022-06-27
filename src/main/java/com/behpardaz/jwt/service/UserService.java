package com.behpardaz.jwt.service;

import com.behpardaz.jwt.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(User user);

    User findByEmail(String email);

    List<User> findAll();
}
