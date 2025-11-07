package SingletonClass;

public class Main {
    //----------------------------------------Singleton Class--------------------------------------------------
    //Singleton class in Java allows only one instance of the class throughout the program.
    //It has a private constructor, a static instance variable, and a public static method to access it.
    //Singleton class is useful for creating a single, shared instance like a logger, database connection, or configuration manager.

    public static void main(String[] args) {
//        Student s = new Student(1,"Sushil");
//        Student s1 = new Student();

        Student s = Student.getInstance();
        Student s1 = Student.getInstance();
//        Student s2 = Student.instance = new Student(1,"Sushil");
        Student s2 = Student.getInstance();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
