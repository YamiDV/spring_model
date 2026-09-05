package com.cursos.api.springmodel.domain.spi;

import com.cursos.api.springmodel.domain.model.User;

import java.util.List;

public interface IPersistencePort {

    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Integer id);
    User update(User user);
    void deleteUserById(Integer id);
}
