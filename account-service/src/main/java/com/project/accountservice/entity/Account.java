package com.project.accountservice.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table(value = "account")
public class Account implements Serializable {
    @PrimaryKey
    private String id= UUID.randomUUID().toString();

    @Setter
    @Column("uname")
    private String username;

    @Setter
    @Column("name")
    private String name;

    @Setter
    @Column("sname")
    private String surname;

    @Setter
    @Column("email")
    private String email;

    @Setter
    @Column("birth_date")
    private Date birthDate;

    @Setter
    @Column("pwd")
    private String password;

    @Column("created_at")
    private Date createdAt;

    @Column("is_active")
    private Boolean active;
}
