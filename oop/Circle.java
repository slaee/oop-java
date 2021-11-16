/**
 * @author: Sly Kint A. Bacalso
 * @date: Nov 10, 2021
 * @description: This class is used to create a cylinder object.
 * @github: github.com/slyg3nius
 */
package oop;
import java.util.*;


class MyPoint{
    private int x;
    private int y;
    public MyPoint(){}
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}

public class Circle {
    private MyPoint center;
    private float radius;

    // default constructor
    public Circle(){
        this.center = new MyPoint();
        this.radius = .0F;
    }
    
    // constructor that takes center and radius
    public Circle(MyPoint center, float radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, float radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }

    /**
     * Setter for radius
     * @param radius
     */
    public void setRadius(float radius){
        this.radius = radius;
    }

    /**
     * Setter for center
     * @param center
     */
    public void setCenter(int x, int y){
        this.center = new MyPoint(x,y);
    }

    /**
     * Getter for radius
     * @return radius
     */
    public float getRadius(){
        return radius;
    }

    /**
     * Getter for center
     * @return center
     */
    public MyPoint getCenter(){
        return center;
    }

    /**
     * Calculates the area of the circle
     * @return area
     */
    public float getArea(){
        return (float) (Math.PI * radius * radius);
    }

    /**
     * Calculates the circumference of the circle
     * @return circumference
     */
    public float getCircumference(){
        return (float) (2 * Math.PI * radius);
    }

    public String toString(){
        return "Radius: " +String.format("%.2f",this.radius)+ "\nPoint: "+center;
    }

    public boolean equals(Object o){
        if(o instanceof Circle ){
            Circle c = (Circle) o;
            return this.center == c.center && this.radius == c.radius;
        }
        return false;
    }

    public static void main(String[] args) {
        switch(new Scanner(System.in).nextInt()){
            case 1: {
                Circle c = new Circle();
                System.out.println(c);
                c.setRadius(25);
                c.setCenter(4,5);
                System.out.println(c);
                break;
            }
                
            case 2: {
                Circle circle  = new Circle(new MyPoint(1,2),4.5f);
                System.out.println(circle);
                break;
            }
                
            case 3: 
                Circle circle = new Circle(10,20,11.5f);
                System.out.println(circle);
                break;
                
            case 4: 
                Circle c = new Circle(10,20,5);
                System.out.printf("Area: %.2f\n",c.getArea());
                System.out.printf("Circumference: %.2f",c.getCircumference());
                break;
            
        }
    }
}