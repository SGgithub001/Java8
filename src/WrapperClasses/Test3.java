package WrapperClasses;

public class Test3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        fun(student);
        System.out.println(student.id);
    }
    private static void fun(Student s){
//        Student student = new Student();
//        student.id = 2;
//        s = student;
        s.id = 2;       // -> here object change
    }
}

class Student{
    public int id;
}
