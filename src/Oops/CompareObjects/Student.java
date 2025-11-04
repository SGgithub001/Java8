package Oops.CompareObjects;

//Compare object on based on maxMax
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int maxMarks;
    int rollNumber;
    Student(int maxMarks, int rollNumber){
        this.maxMarks = maxMarks;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        String val = "Marks : " + this.maxMarks + " , " + "Roll Number " + rollNumber;
        return val;
    }

    @Override
    public int compareTo(Student that) {
        int mark1 = this.maxMarks;                 //o1 -> this and o2 -> that
        int mark2 = that.maxMarks;
        if(mark1 == mark2){
            return this.rollNumber-that.rollNumber;
        }
        return that.maxMarks-this .maxMarks;
    }
}
class CompareObjects{
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(90,20));
        arr.add(new Student(90,10));
        arr.add(new Student(88,22));
        arr.add(new Student(88,24));
        arr.add(new Student(96,2));
        arr.add(new Student(64,1));
        CompareObjects c = new CompareObjects();
        Comparator<Student> s = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int mark1 = o1.maxMarks;
                int mark2 = o2.maxMarks;
                if(mark1 == mark2){
                 return o1.rollNumber-o2.rollNumber;
                }
                return o2.maxMarks-o1.maxMarks;
            }
        };
        Collections.sort(arr,s);
        c.display(arr);
    }
    public <T> void display(ArrayList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
//            if(i != list.size() - 1){
//                System.out.print(",");
//            }
        }
        System.out.println();
    }
}