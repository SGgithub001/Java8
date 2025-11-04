package Oops.NestedClasses;
class Outer{
    static int rollNumber;
    String name;
    private int age;
    int data;
    Outer(){
        rollNumber = 132;
        this.name = "Sushil";
        this.age = 21;
        this.data = 10;
        System.out.println("Init Outer !!");
    }
    public void displayData(){
        System.out.println("Outer data is " + data);
        Inner obj = new Inner();
        System.out.println("Inner data is " + obj.data);
        System.out.println("Inner rollNumber is " + Inner.rollNumber);
    }

    //member inner class
    class Inner{
        static int rollNumber;
        static String name;
        int data;
        Inner(){
            name = "Inner";
            this.data = 20;
            System.out.println("Init Inner !!");
        }
        public void displayData(){
            System.out.println("Data is " + data);
            System.out.println("Outer data is " + Outer.this.data);
            System.out.println("Outer age is " + Outer.this.age);
            Outer.this.displayData();
        }

        public void displayRollNumber(){
            System.out.println("Outer roll number is " + Outer.rollNumber);
            System.out.println("Inner roll number is " + Inner.rollNumber);
        }
    }

    class innerNew extends Inner{

    }
}

//Local inner class
class Fan{
    void display(){
        System.out.println("Outer display");
        class innerFan{
            void display(){
                System.out.println("Inner display");
            }
        }
        innerFan f = new innerFan();
        f.display();
    }
}

//Anonymous in a class
class Normal{
    void display(){
        System.out.println("This is normal class");
    }
}

abstract class noName{
    abstract void display();
    abstract void print();

}
interface NoGame{
    void display();
}


// Static class or static nested class
class OuterNonStatic{
    static class InnerStatic{
        static int age;
        String name;
        void display(){
            age = 20;
            name = "Sushil";
            System.out.println("Non Static method inside static inner class");
        }
        static class InnerSecondStatic{
            static void display(){
                System.out.println("Static method in non-static Inner class");
            }
        }
    }
}
public class Nested {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        Outer.Inner innerObject = obj1.new Inner();       //Object of inner Class

        obj1.displayData();
        innerObject.displayData();

        noName nn = new noName() {
            void display() {
                System.out.println("Anonymous class");
            }
            void print() {
                System.out.println("printed abstract noName class");
            }
        };

        nn.display();
        nn.print();

        NoGame ng = new NoGame() {
            public void display() {
                System.out.println("NoGame interface class");
            }
        };
        ng.display();
    }
}
