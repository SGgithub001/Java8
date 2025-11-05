package StreamsApi;

import java.util.ArrayList;
import java.util.Objects;

public class Employee {
    int id;
    String name;
    Integer salary;
    String designation;
    ArrayList<String> emails = new ArrayList<>();

    Employee(){}
    Employee(int salary){
         this.salary = salary;
    }
    Employee(int id, String name, Integer salary, String designation, String email1, String email2){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        emails.add(email1);
        emails.add(email2);
    }


    @Override
    public int hashCode(){
        return Objects.hashCode(name);         //use name to compute hashcode, matching equals
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee e2 = (Employee) obj;
        return Objects.equals(this.name,e2.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.designation + " " + this.salary + " " + this.emails;
    }
}
