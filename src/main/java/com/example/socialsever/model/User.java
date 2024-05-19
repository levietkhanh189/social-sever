package com.example.socialsever.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Base64;

@Entity
@Table(name = "app_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String email;
    private String password;
    private String userName;

    @Lob
    private byte[] image; // Change from byte[] to String
    private String bio;

    // Getters and setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setImage(String image) {
        this.image = Base64.getDecoder().decode(image);
    }

    public String getImage() {
        return Base64.getEncoder().encodeToString(this.image);
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
