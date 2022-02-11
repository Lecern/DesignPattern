package com.jerry.Singleton;

public class Client {

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance1 == instance2);

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1 == eagerSingleton2);

        EnumSingleton enumSingleton1 = EnumSingleton.instance.getInstance();
        EnumSingleton enumSingleton2 = EnumSingleton.instance.getInstance();
        System.out.println(eagerSingleton1 == eagerSingleton2);

        InnerClassSingleton innerClassSingleton1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassSingleton2 = InnerClassSingleton.getInstance();
        System.out.println(innerClassSingleton1 == innerClassSingleton2);

    }
}
