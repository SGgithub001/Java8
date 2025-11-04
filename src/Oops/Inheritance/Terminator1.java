package Oops.Inheritance;

//Single Level
//
//public class Terminator1 {
//    String pname;
//    int page;
//    public void displayParent(){
//        System.out.println("Parent name is "+ pname);
//    }
//
//    private void displayAge(){                      //Data hiding -> restricting acces
//        System.out.println("Parent age is "+ page);
//    }
//}
//class child extends Terminator1{
//    String cname;
//    int cage;
//    public void displayChild(){
//        System.out.println("Child name is " + cname);
//    }
//}



//Multi level

//public class Terminator1 {
//    String pname;
//    int page;
//    public void displayParent(){
//        System.out.println("Parent name is "+ pname);
//    }
//
//    private void displayAge(){                      //Data hiding -> restricting acces
//        System.out.println("Parent age is "+ page);
//    }
//}
//class child1 extends Terminator1{
//    String c1name;
//    int c1age;
//    public void displayChild(){
//        System.out.println("Child name is " + c1name);
//    }
//}
//
//class child2 extends child1{
//    String c2name;
//    int c2age;
//    public void displayChild(){
//        System.out.println("Child name is " + c2name);
//    }
//}



//hierarchical

public class Terminator1 {
    String pname;
    int page;
    public void displayParent(){
        System.out.println("Parent name is "+ pname);
    }

    private void displayAge(){                      //Data hiding -> restricting acces
        System.out.println("Parent age is "+ page);
    }
}
class child1 extends Terminator1{
    String c1name;
    int c1age;
    public void displayChild(){
        System.out.println("Child name is " + c1name);
    }
}

class child2 extends Terminator1{
    String c2name;
    int c2age;
    public void displayChild(){
        System.out.println("Child name is " + c2name);
    }
}

//by default behaviour
class M1 extends Object{
    int age;
    public void display(){

    }
}

