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
public class PostComment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Column
    private Long likes;

    @ManyToOne
    private Post post;

    @ManyToOne
    private PostComment parentComment;

    @OneToMany(mappedBy = "parentComment")
    private List<PostComment> childComments;

}
