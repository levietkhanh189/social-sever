package com.example.socialsever.controller;

import com.example.socialsever.model.Like;
import com.example.socialsever.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/likes")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @GetMapping
    public List<Like> getAllLikes() {
        return likeService.getAllLikes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Like> getLikeById(@PathVariable int id) {
        Optional<Like> like = likeService.getLikeById(id);
        return like.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/user/{userId}")
    public List<Like> getLikesByUserId(@PathVariable int userId) {
        return likeService.getLikesByUserId(userId);
    }

    @GetMapping("/post/{postId}")
    public List<Like> getLikesByPostId(@PathVariable int postId) {
        return likeService.getLikesByPostId(postId);
    }

    @PostMapping
    public Like createLike(@RequestBody Like like) {
        return likeService.saveLike(like);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLike(@PathVariable int id) {
        likeService.deleteLike(id);
        return ResponseEntity.ok().build();
    }
}
