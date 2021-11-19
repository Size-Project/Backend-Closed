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

    private String password;

    private String email;

    private String name;

    @Embedded
    private Address address;

    private String zip;

    @Builder
    public User(
            Long id,
            String accountId,
            String password,
            String email,
            String name,
            Address address,
            String zip
    ) {
        this.id = id;
        this.accountId = accountId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.address = address;
        this.zip = zip;
    }
}
