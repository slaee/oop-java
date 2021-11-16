package oop;

public class Parent{
    private int x;
    private int y;

    public Parent(){
        this(2, 2);
    }

    public Parent(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("x = " + x + " y = " + y);
    }
}