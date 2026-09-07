package com.cursos.api.springmodel.application.dto;

import com.cursos.api.springmodel.domain.model.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;

}
