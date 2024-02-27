package com.sy.myboardservice.service;

import com.sy.myboardservice.domain.PostComment;
import com.sy.myboardservice.repository.PostCommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostCommentService {

    private final PostCommentRepository postCommentRepository;

    public void createPostComment(PostComment postComment) {
        postCommentRepository.save(postComment);
    }

    public List<PostComment> selectComments(Long postId) {
        return postCommentRepository.findAllByPostIdOrderByRgstDtmDesc(postId);
    }

    public void updatePostComment(PostComment postComment) {
        postCommentRepository.save(postComment);
    }

    public void deletePostComment(Long postCommentId) {
        postCommentRepository.deleteById(postCommentId);
    }
}
