package com.hypertek.ClassesAndPointers;

public class Cookies {
    private final String Color;

    public Cookies(String color) {
        this.Color = color;
    }
}
class Main{
    public static void main(String[] args) {
        var green = new Cookies("Green");
        System.out.println(green);

    }
}
