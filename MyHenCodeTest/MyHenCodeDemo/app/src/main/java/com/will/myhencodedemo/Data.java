package com.will.myhencodedemo;

/**
 * Created by Will on 2017/10/25/025.
 */

public class Data {
    private String name;
    private float number;
    private int color;
    public Data(String name, float number, int color) {
        this.name = name;
        this.number = number;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public float getNumber() {
        return number;
    }
    public int getColor() {
        return color;
    }
}
