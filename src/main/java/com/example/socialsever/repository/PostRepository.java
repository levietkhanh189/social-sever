package com.example.socialsever.repository;

import com.example.socialsever.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    List<Post> findByCaptionContaining(String keyword);
}

