package FunctionalInterface;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

//                   --- Functional Interfaces ---
//        Consumer<T> -> take input, modify , no output, method: void accept(T t);
//        Predicate<T> -> take input, modify, boolean output, method: boolean test(T t);
//        Function<T,R> -> take input T, modify, R output, method: R apply(T t);
//        Supplier<T> -> no input, T output, method: T get();
//                   --- Functional Interfaces ---

        Consumer<Integer> consumer1 = (n) -> System.out.println(n);
        consumer1.accept(10);

        Consumer<Student> consumer2 = (n) -> {
            n.setName("Sushil");
            System.out.println(n.name);
        };
        Student s1 = new Student();
        consumer2.accept(s1);


        Predicate<Integer> predicate = (n) -> n%2 == 0;
        System.out.println(predicate.test(8));

        Predicate<Student> predicate2 = (n) -> {
           if(n.name.length()%2 == 0){
               return true;
           }else{
               return false;
           }
        };
        Student s2 = new Student("Ayush");
        System.out.println(predicate2.test(s2));


        Function<Integer,String> function1 = (n) ->{
            if(n%2 == 0){
                return "Even";
            }else {
                return "ODD";
            }
        };
        System.out.println(function1.apply(5));

        Function<Student,String> function2 = (n) -> {
            if(n.name.length()%2 == 0){
                return "Even";
            }else {
                return "ODD";
            }
        };
        Student s3 = new Student("Aman");
        System.out.println(function2.apply(s3));

        Supplier<Student> supplier = () -> new Student("Golu");
        Student s4 = supplier.get();
        System.out.println(s4.name);




//                         --- Functional Interfaces ---
//        BiConsumer<T,U> -> take input, modify , no output, method: void accept(T t, U t);
//        BiPredicate<T,U> -> take input, modify, boolean output, method: boolean test(T t, U t);
//        BiFunction<T,U,R> -> take input T and U, modify, R output, method: R apply(T t, U t);
//        X Supplier<T> -> no input, T output, method: T get();
//                         --- Functional Interfaces ---

        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a*b);
        biConsumer.accept(5,7 );

        BiPredicate<Integer,Integer> biPredicate = (a,b) -> (a*b)%2 == 0;
        System.out.println(biPredicate.test(5,6));

        BiFunction<Integer,Integer,String> biFunction = (a,b) -> ((a*b)%2 == 0) ? "Even" : "Odd";
        System.out.println(biFunction.apply(5,6));


    }
}
