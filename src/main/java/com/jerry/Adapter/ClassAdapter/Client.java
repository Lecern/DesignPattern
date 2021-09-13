package com.jerry.Adapter.ClassAdapter;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readSD(new SDCardImpl());

        System.out.println("=============================");

        computer.readSD(new SDAdapterTF());
    }
}
