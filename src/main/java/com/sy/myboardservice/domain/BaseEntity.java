package com.sy.myboardservice.domain;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity {

    @Column
    LocalDateTime rgstDtm;

    @Column(length = 20)
    String rgsrId;

    @Column(length = 20)
    LocalDateTime updDtm;

    @Column
    String updrId;
}
