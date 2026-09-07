package com.cursos.api.springmodel.application.handler;

import com.cursos.api.springmodel.application.dto.UserRequest;
import com.cursos.api.springmodel.application.dto.UserResponse;

import java.util.List;

public interface IUserHandler {

    UserResponse registerUser(UserRequest userRequest);
    List<UserResponse> getAllUsers();

}
