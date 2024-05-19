package com.example.socialsever.repository;

import com.example.socialsever.model.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
    List<Like> findByUserId(int userId);
    List<Like> findByPostId(int postId);
}
