package com.example.designpatterns.creational.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton(){
        if(instance != null){
            throw new RuntimeException("use getInstace()"); // evitar que seja chamado por reflection
        }
    }

    public static DbSingleton getInstance(){
        if (instance == null) {
            synchronized (DbSingleton.class){
                if (instance == null) {
                    instance = new DbSingleton(); // lazy loading
                }
            }

        }
        return instance;
    }
}
