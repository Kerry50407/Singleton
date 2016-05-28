package com.example.kerry.singleton;

/**
 * Created by Kerry on 2016/5/27.
 */
public class Singleton {
    private static Singleton sInstance;
    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
