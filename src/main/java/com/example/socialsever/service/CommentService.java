package com.example.socialsever.service;

import com.example.socialsever.model.Comment;
import com.example.socialsever.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Transactional(readOnly = true)
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Comment> getCommentById(int id) {
        return commentRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<Comment> getCommentsByPostId(int postId) {
        return commentRepository.findByPostId(postId);
    }

    @Transactional(readOnly = true)
    public List<Comment> getCommentsByUserId(int userId) {
        return commentRepository.findByUserId(userId);
    }

    @Transactional
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Transactional
    public void deleteComment(int id) {
        commentRepository.deleteById(id);
    }
}
