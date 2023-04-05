package com.example.designpatterns.creational.factory;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new ContactPage());
    }
}
