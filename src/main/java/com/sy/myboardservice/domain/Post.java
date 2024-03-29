package com.sy.myboardservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Post extends BaseEntity{

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

    @ManyToOne
    private Member member;

    @OneToMany(mappedBy = "post")
    private List<PostComment> postComments;
}
