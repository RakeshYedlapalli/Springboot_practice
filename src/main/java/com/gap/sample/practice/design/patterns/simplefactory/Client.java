package com.gap.sample.practice.design.patterns.simplefactory;

public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.getPost("sss");
        System.out.println(post);
    }
}
