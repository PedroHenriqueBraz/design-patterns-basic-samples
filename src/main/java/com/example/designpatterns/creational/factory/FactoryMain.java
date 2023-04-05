package com.example.designpatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args){
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());
    }
}
