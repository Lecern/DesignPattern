package com.jerry.Singleton;

public enum EnumSingleton {
    instance;

    public EnumSingleton getInstance() {
        return instance;
    }
}
