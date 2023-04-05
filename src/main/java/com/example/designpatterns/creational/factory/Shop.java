package com.example.designpatterns.creational.factory;

public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ProductPage());
    }
}