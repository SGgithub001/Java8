package WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //Wrapper Classes -> Convert primitive values to object references
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1;

        //Autoboxing -> Automatically converting primitive into Integer
//        Integer b = Integer.valueOf(1);
        //AutoUnboxing -> reverse of autoboxing
//        int c = b.intValue();

        boolean hadGraphics = true;
        Boolean isAdult = true;
        String s = "Sushil";
        Float f = 1.21f ;
        Double d = 1.232;
        Character c = 's';
        Byte bb = 1;
        Short ss = 2;
        Long l = 123l;

//        List<int> list = new ArrayList<>();  -> Type argrument cannt be of primitive data type
        List<Integer> list = new ArrayList<>();

    }
}
