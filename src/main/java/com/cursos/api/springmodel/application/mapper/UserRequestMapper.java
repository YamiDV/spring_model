package com.cursos.api.springmodel.application.mapper;

import com.cursos.api.springmodel.application.dto.UserRequest;
import com.cursos.api.springmodel.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserRequestMapper {

    @Mapping(target = "role", ignore = true)
    User toUser(UserRequest userRequest);
}
