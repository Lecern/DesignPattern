package com.jerry.Proxy.CGLIBProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private TrainStation station = new TrainStation();

    public TrainStation getProxyInstance() {
        // 类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象 -> 即目标类（被代理类）
        // 注意CGLIB不能对声明为final的类或方法进行代理，因为CGLIB的原理是动态生成被代理类的子类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("代售点收取费用（CGLIB）");
        System.out.println(method.getName());
        // 要调用目标对象的方法
        return method.invoke(station, args);
    }
}
