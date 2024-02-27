package com.sy.myboardservice.dto;

import com.sy.myboardservice.domain.Post;
import com.sy.myboardservice.domain.PostComment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostCommentDto {

    private Long id;

    private String comment;

    private Long postId;

    private Long parentCommentId;


    public static PostCommentDto from(PostComment postComment) {
        return PostCommentDto.builder()
                .id(postComment.getId())
                .comment(postComment.getComment())
                .parentCommentId(postComment.getParentComment().getId())
                .build();
    }

    public static List<PostCommentDto> listForm(List<PostComment> postComments) {
        List<PostCommentDto> postCommentDtos = new ArrayList<>();
        postComments.forEach(
                postComment -> postCommentDtos.add(new PostCommentDto(postComment))
        );
        return postCommentDtos;
    }

    public PostCommentDto(PostComment postComment) {
        this.id = postComment.getId();
        this.comment = postComment.getComment();
        this.postId = postComment.getPost().getId();
        this.parentCommentId = postComment.getParentComment() == null ? null : postComment.getParentComment().getId();
    }

    public PostComment toEntity() {
        return PostComment.builder()
                .comment(comment)
                .post(Post.builder().id(this.postId).build())
                .parentComment(PostComment.builder().id(this.parentCommentId).build())
                .build();
    }
}
