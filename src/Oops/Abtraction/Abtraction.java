package Oops.Abtraction;

public class Abtraction {
    public static void main(String[] args) {
//      Bank b = new Bank();   -> nhi chalega
        Bank b1 = new PNB();
        System.out.println(b1.roi());
        b1.display();
        Bank b2 = new SBI();
        System.out.println(b2.roi());
        Bank b3 = new NewBank();
        System.out.println(b3.roi());
    }
}

abstract class Bank{
    String msg;
    Bank(){
        msg = "Sir !!";
        System.out.println("This is Constructor");
    }
    abstract int roi();
    void display(){
        System.out.println("Welcome to Bank, " + msg);
    }
}

class PNB extends Bank{
    int roi() {
        return 10;
    }
}

class  SBI extends Bank{
    int roi() {
        return 9;
    }
}

abstract class HDFC extends Bank{
    void print(){
        System.out.println("Hi HDFC");
    }
}

class NewBank extends HDFC{
    int roi() {
        return 11;
    }
}
