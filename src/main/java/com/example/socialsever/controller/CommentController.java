package com.example.socialsever.controller;

import com.example.socialsever.model.Comment;
import com.example.socialsever.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comment> getCommentById(@PathVariable int id) {
        Optional<Comment> comment = commentService.getCommentById(id);
        return comment.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getCommentsByPostId(@PathVariable int postId) {
        return commentService.getCommentsByPostId(postId);
    }

    @GetMapping("/user/{userId}")
    public List<Comment> getCommentsByUserId(@PathVariable int userId) {
        return commentService.getCommentsByUserId(userId);
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable int id) {
        commentService.deleteComment(id);
        return ResponseEntity.ok().build();
    }
}
