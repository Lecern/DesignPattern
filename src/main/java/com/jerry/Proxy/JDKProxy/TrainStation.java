package com.jerry.Proxy.JDKProxy;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("买到火车票");
    }
}
