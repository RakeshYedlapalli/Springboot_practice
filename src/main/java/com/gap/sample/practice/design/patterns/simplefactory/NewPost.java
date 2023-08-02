package com.gap.sample.practice.design.patterns.simplefactory;

public class NewPost extends Post{

    private String headline;
    private String newTime;

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setNewTime(String newTime) {
        this.newTime = newTime;
    }

    public String getHeadline() {
        return headline;
    }

    public String getNewTime() {
        return newTime;
    }
}
