package com.crud.restapi.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCredential {
    private String email;
    private String password;
}
