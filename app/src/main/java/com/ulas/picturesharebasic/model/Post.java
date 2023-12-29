package com.ulas.picturesharebasic.model;

public class Post {

    public String email;
    public String comment;
    public String dowloadUrl;

    public Post(String email, String comment, String dowloadUrl) {
        this.email = email;
        this.comment = comment;
        this.dowloadUrl = dowloadUrl;
    }
}
