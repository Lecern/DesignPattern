package com.jerry.Singleton;

public class InnerClassSingleton {

    private InnerClassSingleton() {}

    private static class InnerInstance {
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerInstance.innerClassSingleton;
    }
}
