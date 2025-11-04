package Oops.Polymorphism;

public class Terminator {
    String pname;
    int page;
    Terminator(){
        System.out.println("Constructor of Parent Class");
    }
    public void display(){
        System.out.println("Parent name is "+ pname);
    }

    private void displayAge(){
        System.out.println("Parent age is "+ page);
    }
}
class child extends Terminator{
    String cname;
    int cage;

    child(){
        System.out.println("Child class Constructor");
    }
    public void display(){
        System.out.println("Child name is " + cname);
    }

    public static void main(String[] args) {
        Terminator t1 = new Terminator();
        t1.display ();
        Terminator t2 = new child();
        t2.display();
        t2.pname = "Sushil";
        t2.display();
        t1.pname = "Golu";
        t1.display();
    }
}


