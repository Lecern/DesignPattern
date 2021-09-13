package com.jerry.Adapter.ObjectAdapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 使用电脑读取SD卡中数据
        computer.readSD(new SDCardImpl());

        System.out.println("=================");
        // 使用该电脑读取TF卡中数据
        computer.readSD(new SDAdapterTF(new TFCardImpl()));
    }
}
