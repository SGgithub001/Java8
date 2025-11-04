package Generics;

// T -> type
// E -> element
// K -> key
// V -> value

public class MyGeneric {

    public <T> void myGen(T element){
        System.out.println("Hii Generics " + element);
    }

    public static void main(String[] args) {
        MyGeneric mg = new MyGeneric();
        mg.myGen("Sushil");
//        IntegerDisplayer obj = new IntegerDisplayer();
//        obj.setNum(132);
//        obj.display();
//
//        DoubleDisplayer obj1 = new DoubleDisplayer();
//        obj1.setNum(132.22 );
//        obj1.display();

//        Displayer<Integer> obj2 = new Displayer<>();
//        obj2.setNum(121);
//        obj2.display();
//
//        Displayer<Double> obj3 = new Displayer<>();
//        obj3.setNum(121.01);
//        obj3.display();

//        Displayer<Student> obj2 = new Displayer<>();
//        obj2.setNum(new Student());
//        obj2.display();
//
//        Displayer<Teacher> obj4 = new Displayer<>();
//        obj4.setNum(new Teacher());
//        obj4 .display();
    }
}

class College{
    void printCollegeName(){
        System.out.println("XYZ institute of technology");
    }
}

class Student extends College{
     void printName(){
         System.out.println("Student Name Printed");
     }
}

class Teacher extends College{
    void printName(){
        System.out.println("Teacher Name Printed");
    }
}

class Displayer<T extends College>{
    T num;

    public void setNum(T num) {
        this.num = num;
    }
    public void display(){
        System.out.println("Element -> " + num);
    }
}

class IntegerDisplayer{
    Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }
    public void display(){
        System.out.println("Element -> " + num);
    }
}

class DoubleDisplayer{
    Double num;

    public void setNum(Double num) {
        this.num = num;
    }
    public void display(){
        System.out.println("Element -> " + num);
    }
}
