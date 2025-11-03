package Oops;

class Car{
    String brand;
    String model;
    String color;
    boolean isABS;
    int speed;

    Car(String brand, String color, String model, boolean isABS, int speed){               //constructor
        System.out.println("init (Paramertized)");
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.isABS = isABS;
        this.speed = speed;
    }

    Car(){
        System.out.println("This is Default");
        this.brand = "Kia";
        this.model = "Sonet";
        this.speed = 80;
        this.color = "Black";
        this.isABS = true;
    }

    Car(Car newCar){
        this.speed = newCar.speed;
        this.isABS = newCar.isABS;
        this.brand = newCar.brand;
        this.model = newCar.model;
        this.color = newCar.color;
        System.out.println("Copy Constructor invoked");
    }

    public void drive(){
        System.out.println("Driving");
    }
    public void speedUp(int newSpeed){
        speed = newSpeed;
        System.out.println("Speed Up !!");
    }
}

public class Classes {
    public static void main(String[] args) {
   //     Car object;  //no memory allocation
        Car obj = new Car();   //object is allowed in heap memory
        System.out.println("Speed : " + obj.speed);
        Car obj2 = new Car("Ford","White","EcoSport",true,85);
        System.out.println("Speed : " + obj2.speed);

        // copy Constructor  -> deep copy - to copy the values
        Car obj3 = new Car(obj2);
        System.out.println("Speed : " + obj3.speed);
        obj2.speed = 100;
        System.out.println("Speed : " + obj2.speed);
        System.out.println("Speed : " + obj3 .speed);

        //Same reference -> shallow copy - to copy the references
        Car obj4 = obj2;
        System.out.println("Object 2 Speed : " + obj2.speed);
        System.out.println("Object 4 Speed : " + obj4.speed);
        obj2.speed = 120;
        System.out.println("Object 2 Speed : " + obj2.speed);
        System.out.println("Object 4 Speed : " + obj4.speed);

    }
}
