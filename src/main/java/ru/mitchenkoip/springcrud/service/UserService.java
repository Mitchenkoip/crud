package ru.mitchenkoip.springcrud.service;

import ru.mitchenkoip.springcrud.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    void update(User user);
    void delete(Long id);
    User findById(Long id);
}
