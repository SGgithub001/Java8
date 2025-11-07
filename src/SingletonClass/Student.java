package SingletonClass;

public class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

   private Student(){}

    private static Student instance = null;
    public static Student getInstance(){
       if(instance == null){
           instance = new Student();
       }
       return instance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
