package com.sy.myboardservice.service;

import com.sy.myboardservice.domain.Post;
import com.sy.myboardservice.exception.DataNotFoundException;
import com.sy.myboardservice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void createPost(Post post) {
        postRepository.save(post);
    }

    public Post selectPost(Long id) {
        return postRepository.findById(id).orElseThrow(DataNotFoundException::new);
    }

    public Page<Post> selectPostList(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    public void updatePost(Post post) {
        postRepository.findById(post.getId()).orElseThrow(DataNotFoundException::new);
        postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
