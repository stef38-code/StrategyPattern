package com.stephane.strategy.pattern.examples.client.rest.response.post;

import lombok.Data;

public @Data
class Post {
    private int id;
    private String title;
    private String body;
    private int userId;
}