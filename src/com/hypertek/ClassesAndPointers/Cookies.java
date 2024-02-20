package com.hypertek.ClassesAndPointers;

public class Cookies {
    private final String color;

    public Cookies(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
class Main{
    public static void main(String[] args) {
        var green = new Cookies("Green");
        System.out.println(green.getColor());


    }
}
