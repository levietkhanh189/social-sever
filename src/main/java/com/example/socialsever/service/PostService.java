package com.example.socialsever.service;

import com.example.socialsever.model.Post;
import com.example.socialsever.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Transactional(readOnly = true)
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Post> getPostById(int id) {
        return postRepository.findById(id);
    }

    @Transactional
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Transactional
    public List<Post> searchPosts(String keyword) {
        return postRepository.findByCaptionContaining(keyword);
    }

    @Transactional
    public void deletePost(int id) {
        postRepository.deleteById(id);
    }
}
