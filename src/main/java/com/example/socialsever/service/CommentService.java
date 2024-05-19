package com.example.socialsever.service;

import com.example.socialsever.model.Comment;
import com.example.socialsever.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(int id) {
        return commentRepository.findById(id);
    }

    public List<Comment> getCommentsByPostId(int postId) {
        return commentRepository.findByPostId(postId);
    }

    public List<Comment> getCommentsByUserId(int userId) {
        return commentRepository.findByUserId(userId);
    }

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(int id) {
        commentRepository.deleteById(id);
    }
}

