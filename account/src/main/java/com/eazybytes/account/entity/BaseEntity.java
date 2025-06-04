package com.eazybytes.account.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)
    private String created_at;

    @Column(updatable = false)
    private String created_by;

    @Column(insertable = false)
    private String updated_at;

    @Column(insertable = false)
    private String updated_by;
}
