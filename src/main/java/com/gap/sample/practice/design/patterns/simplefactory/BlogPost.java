package com.gap.sample.practice.design.patterns.simplefactory;

public class BlogPost extends Post{

    private String blogNews;
    private String blogId;

    public String getBlogNews() {
        return blogNews;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogNews(String blogNews) {
        this.blogNews = blogNews;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }
}
