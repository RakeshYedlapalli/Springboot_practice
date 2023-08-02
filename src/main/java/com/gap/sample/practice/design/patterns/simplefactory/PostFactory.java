package com.gap.sample.practice.design.patterns.simplefactory;

public class PostFactory {


    public static Post getPost(String postType) {

        switch (postType) {
            case "newPost":
                return new NewPost();
            case "blogPost":
                return new BlogPost();
            default:
                throw new IllegalArgumentException("Wrong parameter is passed");
        }
    }
}
