package com.jerry.Proxy.CGLIBProxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyInstance = proxyFactory.getProxyInstance();
        proxyInstance.sell();
    }
}
