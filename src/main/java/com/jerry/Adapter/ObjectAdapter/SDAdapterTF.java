package com.jerry.Adapter.ObjectAdapter;

public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSDCard() {
        return tfCard.readTFCard();
    }

    @Override
    public void writeSDCard(String msg) {
        tfCard.writeTFCard(msg);
    }
}
