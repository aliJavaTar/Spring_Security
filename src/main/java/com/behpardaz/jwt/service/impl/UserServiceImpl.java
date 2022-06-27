package com.behpardaz.jwt.service.impl;

import com.behpardaz.jwt.entity.User;
import com.behpardaz.jwt.repository.UserRepository;
import com.behpardaz.jwt.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return repository.findUserByEmail(email);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
