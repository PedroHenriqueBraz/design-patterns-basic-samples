package com.example.designpatterns.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("pao").condiments("COND");

        var lunch = builder.build();

        System.out.println(lunch.getBread());
    }
}
