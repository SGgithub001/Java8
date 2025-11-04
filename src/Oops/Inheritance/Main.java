package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Terminator1 t1 = new Terminator1();
//        t1.pname = "Sushil";
//        t1.displayParent();
//        child c1 = new child();
//        c1.cname = "Rahul";
//        c1.displayChild();
//        c1.displayParent();

        Terminator1 t2 = new Terminator1();
        t2.pname = "Sushil";
        t2.displayParent();
        child1 c1 = new child1();
        c1.c1name = "Rahul";
        c1.displayChild();
        c1.displayParent();
        child2 c2 = new child2();
        c2.pname = "Ajay";
        c2.displayParent();

        M1 m = new M1();
        m.hashCode();
    }
}
