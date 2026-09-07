package com.cursos.api.springmodel.application.mapper;

import com.cursos.api.springmodel.application.dto.UserResponse;
import com.cursos.api.springmodel.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserResponseMapper {

    @Mapping(target = "role", ignore = true)
    UserResponse toUserResponse(User user);
}
