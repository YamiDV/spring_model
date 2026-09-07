package com.cursos.api.springmodel.infrastructure.out.jpa.mapper;


import com.cursos.api.springmodel.domain.model.User;
import com.cursos.api.springmodel.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserEntityMapper {

    UserEntity toUserEntity(User user);
    User toUser(UserEntity userEntity);
}
