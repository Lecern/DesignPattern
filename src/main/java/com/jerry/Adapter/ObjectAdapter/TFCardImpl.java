package com.jerry.Adapter.ObjectAdapter;

public class TFCardImpl implements TFCard {
    @Override
    public String readTFCard() {
        return "TF card read message: Hello World TF Object";
    }

    @Override
    public void writeTFCard(String msg) {
        System.out.println("TF card write message: " + msg);
    }
}
