package com.example.socialsever.service;

import com.example.socialsever.model.Like;
import com.example.socialsever.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    @Transactional(readOnly = true)
    public List<Like> getAllLikes() {
        return likeRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Like> getLikeById(int id) {
        return likeRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Like> getLikesByUserId(int userId) {
        return likeRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public List<Like> getLikesByPostId(int postId) {
        return likeRepository.findByPostId(postId);
    }

    @Transactional
    public Like saveLike(Like like) {
        return likeRepository.save(like);
    }

    @Transactional
    public void deleteLike(int id) {
        likeRepository.deleteById(id);
    }
}
