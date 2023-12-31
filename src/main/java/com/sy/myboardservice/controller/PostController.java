package com.sy.myboardservice.controller;

import com.sy.myboardservice.domain.Post;
import com.sy.myboardservice.dto.PostDto;
import com.sy.myboardservice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post")
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("")
    public void createPost(@RequestBody PostDto postDto) {
        Post post = postDto.toEntity();
        postService.createPost(post);
    }

    @GetMapping("/{id}")
    public PostDto selectPost(@PathVariable Long id) {
        return PostDto.from(postService.selectPost(id));
    }

    @GetMapping("")
    public Page<PostDto> selectAll(@PageableDefault(sort="id", direction= Sort.Direction.DESC) Pageable pageable) {
        return postService.selectPostList(pageable).map(PostDto::from);
    }

    @PatchMapping("/{id}")
    public void updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        Post post = postDto.toEntity(id);
        postService.updatePost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }
}


