package com.cienet.OOP;

public class ShapeTest {
    public static void main(String[] args)  {
        Shape shape = new Circle();
        System.out.println(shape.name);
        shape.printShape();
        shape.printN();
    }
}
 
class Shape {
    public String name = "形状";
     
    public Shape(){
        System.out.println("shape constructor构造器");
    }
     
    public void printShape() {
        System.out.println("this is shape");
    }
     
    public static void printN() {
        System.out.println("shape");
    }
}
 
class Circle extends Shape {
    public String name = "圆形";
     
    public Circle() {
        System.out.println("circle constructor构造器");
    }
     
    public void printShape() {
        System.out.println("this is circle");
    }
     
    public static void printN() {
        System.out.println("circle");
    }
}