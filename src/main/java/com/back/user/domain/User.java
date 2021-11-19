package com.back.user.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountId;

    private String email;

    private String password;

    private String name;

    private String profileUrl;

    private String description;

    @Builder
    public User(
            Long id,
            String accountId,
            String email,
            String password,
            String name,
            String profileUrl,
            String description
    ) {
        this.id = id;
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.profileUrl = profileUrl;
        this.description = description;
    }
}
