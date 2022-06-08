package com.hjservice.ma.dto;

import com.hjservice.ma.dto.auth.AuthProvider;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User extends BaseTimeEntity { // extends TimeEntity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column
    private String imageUrl;

    @Column(nullable = false)
    private Boolean emailVerified = false;

//    @Enumerated(EnumType.STRING)
//    @Column(nullable = false)
//    private Role role;

    @JsonIgnore
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private String providerId;

    @Builder
    public User(String name, String email, String picture, Role role) {
        this.name = name;
        this.email = email;
    }

    public User update(String name, String picture) {
        this.name = name;

        return this;
    }

//    public String getRoleKey() {
//        return this.role.getKey();
//    }

}
