package com.sy.myboardservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 100)
    String title;

    @Column(columnDefinition = "TEXT")
    String content;

    @Column
    Long views;

    @Column
    Long likes;

    @Column
    LocalDateTime rgstDtm;

    @Column(length = 20)
    String rgsrId;

    @Column(length = 20)
    LocalDateTime updDtm;

    @Column
    String updrId;
}
