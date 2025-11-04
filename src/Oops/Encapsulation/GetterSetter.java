package Oops.Encapsulation;


//Read only
class ReadOnly{
    private int age;
    private String name;

    ReadOnly(){
        this.age = 21;
        this.name = "Sushil";
    }

    public int getAge(){
        return this.age;
    }

    public String getName(){
        return this.name;
    }
}

//Write only
class WriteOnly{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

//ReadAndWrite
class ReadAndWrite{
    private int age;
    private String name;

    ReadAndWrite(){
        this.age = 20;
        this.name = "Golu";
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        rw.setName("Ankita");
        System.out.println(rw.getName());

        ReadOnly ro = new ReadOnly();
        System.out.println(ro.getName());

        WriteOnly wo = new WriteOnly();
        wo.setName("Ajay");
    }
}
