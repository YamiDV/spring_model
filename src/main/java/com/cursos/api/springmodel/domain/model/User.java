package com.cursos.api.springmodel.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private Role role;

}
