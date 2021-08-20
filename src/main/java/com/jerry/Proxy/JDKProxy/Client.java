package com.jerry.Proxy.JDKProxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets proxyInstance = proxyFactory.getProxyInstance();
        proxyInstance.sell();
    }
}
