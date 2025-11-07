package WrapperClasses;

public class Test4 {
    public static void main(String[] args) {
        Integer a = 1;
        fun(a);
        System.out.println(a);
    }
    private static void fun(Integer i){
        i = 2;
    }
}
