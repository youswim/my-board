package com.sy.myboardservice.dto;

import com.sy.myboardservice.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;

    private String title;

    private String content;

    public Post toEntity() {
        return Post.builder()
                .id(id)
                .title(title)
                .content(content)
                .rgstDtm(LocalDateTime.now())
                .build();
    }

    public Post toEntity(Long id) {
        return Post.builder()
                .id(id)
                .title(title)
                .content(content)
                .rgstDtm(LocalDateTime.now())
                .build();
    }

    public static PostDto from(Post post) {
        return new PostDto(post.getId(), post.getTitle(), post.getContent());
    }
}
