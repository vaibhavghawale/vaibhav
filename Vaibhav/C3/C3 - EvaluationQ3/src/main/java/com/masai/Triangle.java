package com.masai;

public class Triangle implements Shape{

    public void draw() {
        System.out.println("You have drawn Triangle");
    }
    @Override
    public void drawIt() {
        draw();
    }
}
