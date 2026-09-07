package com.cursos.api.springmodel.infrastructure.out.jpa.adapter;

import com.cursos.api.springmodel.domain.model.User;
import com.cursos.api.springmodel.domain.spi.IUserPersistencePort;
import com.cursos.api.springmodel.infrastructure.out.jpa.entity.UserEntity;
import com.cursos.api.springmodel.infrastructure.out.jpa.mapper.UserEntityMapper;
import com.cursos.api.springmodel.infrastructure.out.jpa.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserJpaAdapter implements IUserPersistencePort {

    private final IUserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userEntityMapper.toUserEntity(user);
        UserEntity savedUser = userRepository.save(userEntity);

        return userEntityMapper.toUser(savedUser);
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .map(userEntityMapper::toUser);
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {

    }
}
