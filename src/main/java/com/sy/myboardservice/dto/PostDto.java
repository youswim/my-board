package com.sy.myboardservice.dto;

import com.sy.myboardservice.domain.Post;
import com.sy.myboardservice.domain.PostComment;
import com.sy.myboardservice.utility.Util;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;

    private String title;

    private String content;

    private List<PostCommentDto> postComments;

    private String rgstDtm;

    private String updDtm;

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .build();
    }

    public Post toEntity(Long id) {
        return Post.builder()
                .id(id)
                .title(title)
                .content(content)
                .build();
    }

    public static PostDto from(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .postComments(post.getPostComments().stream().map(PostCommentDto::new).toList())
                .rgstDtm(post.getRgstDtm() == null ? null : Util.TimeFormat.reformatLocalDateTime(post.getRgstDtm()))
                .updDtm(post.getUpdDtm() == null ? null : Util.TimeFormat.reformatLocalDateTime(post.getUpdDtm()))
                .build();
    }
}
