package com.cursos.api.springmodel.domain.api;

import com.cursos.api.springmodel.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserServicePort {

    User saveUser(User user);
    Optional<User> getUserByUsername(String username);
    List<User> getAllUsers();
    User getUserById(Integer id);
    User update(User user);
    void deleteUserById(Integer id);
}
