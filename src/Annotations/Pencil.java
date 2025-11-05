package Annotations;

import java.lang.annotation.*;
@admin(name = "Sameer",id=2 )
@admin(name = "Sushil")
@Print(times = 2)
public class Pencil {
    @dontPrint
    public void Write(){
        System.out.println("I am Writing !!");
    }
    public void printBrand(){
        System.out.println("I am non-branded");
    }
//    @Deprecated
    public boolean isSharpened(){
        return false;
    }
}

class Natraj extends Pencil{

}

class Apsara extends Pencil{
    @Override
    public void printBrand(){
        System.out.println("I am Apsara");
    }
}

@FunctionalInterface
interface Eraser{
    public void erase();
//    public void printName();
}



//          ----------------Custom Annotation------------------
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface dontPrint {

}

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface Print {
    int times() default 1;
}
@Repeatable(adminContainer.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface admin{
    String name();
    int id() default 1;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@interface adminContainer{
    admin[] value();
}
