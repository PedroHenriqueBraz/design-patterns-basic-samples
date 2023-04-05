package com.example.designpatterns.creational.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Registry reg = new Registry();
        var movie = (Movie)reg.createItem("Movie");
        movie.setTitle("movie 2");

        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
    }
}
