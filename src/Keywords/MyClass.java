package Keywords;

//super -> immediate instance from parent
public class MyClass {
    int age;
    MyClass(int age){
        //this -> it refers to instance of current class
        //this access -> attributes,method,static(class level) not used in static area (compile time error)
        //this() -> default constructor call
        //this(age) -> parameterized constructor
        //this(obj) -> copy constructor
        this.age = age;
    }
}
