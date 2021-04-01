package com.qut.ex2.model;

import java.util.Date;

public class ItemInfo {
    private String name;//购买商品名称
    private Date time;//消费时间
    private double price;//消费金额
    private String addr;//消费地点

    public ItemInfo(String name, Date time, double price, String addr) {
        this.name = name;
        this.time = time;
        this.price = price;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
