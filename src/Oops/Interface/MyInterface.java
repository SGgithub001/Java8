package Oops.Interface;

public class MyInterface  {
    public static void main(String[] args) {
        Circle circle =new Circle();
        circle.calArea();
        circle.display();
        circle.some();

        Shape shape = new Circle();
        shape.some();
    }
}

interface Shape{
    String name = "Interface";
    void display();
    void calArea();

    private void greetUser(){
        System.out.println("Welcome user");
    }

    default void some(){
        greetUser();
    }

    static void printName(){
        System.out.println("Name is " + name);
    }
    void fillArea();
}

interface intermediate extends Shape{
    void fillArea();
}

class Circle implements intermediate,Shape{          //multiple inheritance
    private final double pi = 3.14;
    int radius;
    Circle(){
        this.radius = 10;
    }

    public void display() {
        System.out.println("Shape is Circle");
    }

    public void calArea() {
        double area = pi*radius*radius;
        System.out.println("Area is : "+ area);
    }

    public void fillArea() {
        System.out.println("Filled");
    }
}
