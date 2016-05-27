package com.example.kerry.singleton;

/**
 * Created by Kerry on 2016/5/27.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
