package com.jerry.Adapter.ClassAdapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{
    @Override
    public String readSDCard() {
        return readTFCard();
    }

    @Override
    public void writeSDCard(String msg) {
        writeTFCard(msg);
    }
}
