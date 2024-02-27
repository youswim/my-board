package com.sy.myboardservice.repository;

import com.sy.myboardservice.domain.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
    List<PostComment> findAllByPostIdOrderByRgstDtmDesc(Long postId);
}
