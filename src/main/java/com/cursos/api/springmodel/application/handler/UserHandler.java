package com.cursos.api.springmodel.application.handler;

import com.cursos.api.springmodel.application.dto.UserRequest;
import com.cursos.api.springmodel.application.dto.UserResponse;
import com.cursos.api.springmodel.application.mapper.UserRequestMapper;
import com.cursos.api.springmodel.application.mapper.UserResponseMapper;
import com.cursos.api.springmodel.domain.api.IUserServicePort;
import com.cursos.api.springmodel.domain.model.User;
import com.cursos.api.springmodel.domain.spi.IUserPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final UserRequestMapper userRequestMapper;
    private final UserResponseMapper userResponseMapper;

    @Override
    public UserResponse registerUser(UserRequest userRequest) {

        User userSaved = userServicePort.saveUser(userRequestMapper.toUser(userRequest));
        UserResponse userResponse =userResponseMapper.toUserResponse(userSaved);
        return userResponse;
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return List.of();
    }
}
