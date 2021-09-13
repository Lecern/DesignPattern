package com.jerry.Adapter.ObjectAdapter;

public class SDCardImpl implements SDCard {
    @Override
    public String readSDCard() {
        return "SD card read message: Hello World SD Object";
    }

    @Override
    public void writeSDCard(String msg) {
        System.out.println("SD card write message: " + msg);
    }
}
