package com.example.socialsever.model;

import jakarta.persistence.*;
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;

    @Column(name = "post_id", nullable = false)
    private int postId;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "comment_body", nullable = false)
    private String commentBody;

    // Constructors
    public Comment() {
    }

    public Comment(int postId, int userId, String commentBody) {
        this.postId = postId;
        this.userId = userId;
        this.commentBody = commentBody;
    }

    // Getters and Setters
    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }
}
