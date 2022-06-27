package com.behpardaz.jwt.entity;

import com.behpardaz.jwt.enums.UserRoles;
import com.behpardaz.jwt.repository.UserRepository;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;

    @ElementCollection(targetClass = UserRoles.class)
    @CollectionTable( name = "authorities",
            joinColumns = @JoinColumn(name = "email",referencedColumnName = "email"))
    @Enumerated(EnumType.STRING)
    private List<UserRoles> roles;
    private Boolean enabled = true;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
