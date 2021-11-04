package oop;

public class MobilePhone {
    private String brandname;
    private String model;
    private String color;
    private double price;

    public MobilePhone(){
    }

    public MobilePhone(String brandname, String model, String color, double price){
        this.brandname = brandname;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public MobilePhone(String color){
        brandname = "Apple";
        model = "iPhone XR";
        this.color = color;
        price = 54250;
    }

    public void updatePrice(double price){
        if(price < 0 && (this.price + price) > 0){
            this.price += price;
        }
        if(price > 0) {
            this.price += price;
        }
    }

    public void display(){
        System.out.println("Brand: "+brandname);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.printf("Price: %.1f\n", price);
    }
}