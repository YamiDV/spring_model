package com.cursos.api.springmodel.domain.usecase;

import com.cursos.api.springmodel.domain.api.IUserServicePort;
import com.cursos.api.springmodel.domain.model.Role;
import com.cursos.api.springmodel.domain.model.User;
import com.cursos.api.springmodel.domain.spi.IUserPersistencePort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserUseCase implements IUserServicePort {


    private final IUserPersistencePort userPersistencePort;
    private final PasswordEncoder passwordEncoder;

    public UserUseCase(IUserPersistencePort userPersistencePort, PasswordEncoder passwordEncoder) {
        this.userPersistencePort = userPersistencePort;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public User saveUser(User user) {

        user.setPassword(
                passwordEncoder.encode(user.getPassword())
        );

        user.setRole(Role.USER);

        return userPersistencePort.saveUser(user);
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userPersistencePort.getUserByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return userPersistencePort.getUserById(id);
    }

    @Override
    public User update(User user) {
        return userPersistencePort.update(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userPersistencePort.deleteUserById(id);

    }
}
