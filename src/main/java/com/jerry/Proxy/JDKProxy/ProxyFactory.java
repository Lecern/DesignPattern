package com.jerry.Proxy.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private final TrainStation station = new TrainStation();

    public SellTickets getProxyInstance() {
        return (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定费用...");
                        Object obj = method.invoke(station, args);
                        System.out.println("从代售点买到票");
                        return obj;
                    }
                }
        );
    }

}
