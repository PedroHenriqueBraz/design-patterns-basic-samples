package com.example.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> itens = new HashMap<String, Item>();

    public Registry(){
        loadItens();
    }

    public Item createItem(String type){
        Item item = null;
        try {
            item = itens.get(type).clone();
        } catch (AssertionError e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItens(){
        var movie = new Movie();
        movie.setRuntime("123");
        movie.setPrice(12);
        movie.setTitle("movie");
        movie.setUrl("www");
        itens.put("Movie", movie);


        var book = new Book();
        book.setNumberPages(123);
        book.setPrice(1.11);
        book.setTitle("book");
        book.setUrl("www");

        itens.put("Book", book);
    }

}
