package com.sy.myboardservice.controller;

import com.sy.myboardservice.dto.PostCommentDto;
import com.sy.myboardservice.service.PostCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post-comment")
@RequiredArgsConstructor
public class PostCommentController {

    private final PostCommentService postCommentService;

    @PostMapping("")
    public void createPostComment(PostCommentDto postCommentDto) {
        postCommentService.createPostComment(postCommentDto.toEntity());
    }

    @PatchMapping("/{id}")
    public void updatePostComment(PostCommentDto postCommentDto) {
        postCommentService.updatePostComment(postCommentDto.toEntity());
    }

    @DeleteMapping("/{id}")
    public void deletePostComment(@PathVariable Long id) {
        postCommentService.deletePostComment(id);
    }

}
