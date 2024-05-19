package com.example.socialsever.service;

import com.example.socialsever.model.Like;
import com.example.socialsever.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    public Optional<Like> getLikeById(int id) {
        return likeRepository.findById(id);
    }

    public List<Like> getLikesByUserId(int userId) {
        return likeRepository.findByUserId(userId);
    }

    public List<Like> getLikesByPostId(int postId) {
        return likeRepository.findByPostId(postId);
    }

    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    public void deleteLike(int id) {
        likeRepository.deleteById(id);
    }
}
