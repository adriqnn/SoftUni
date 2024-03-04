package org.softuni.exam.entities;

public class User {
    private String id;
    private String username;
    private  int views = 0;
    private  int likes = 0;
    private  int dislikes = 0;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getViews() {
        return views;
    }

    public User setViews(int views) {
        this.views = views;
        return this;
    }

    public int getLikes() {
        return likes;
    }

    public User setLikes(int likes) {
        this.likes = likes;
        return this;
    }

    public int getDislikes() {
        return dislikes;
    }

    public User setDislikes(int dislikes) {
        this.dislikes = dislikes;
        return this;
    }
}
