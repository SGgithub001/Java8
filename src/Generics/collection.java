package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class collection {
    public static void main(String[] args) {
        //increasing order sort -> treemap
        // if i want to convert into decreasing order -> comparator

//        Comparator<Integer> c1 = (a,b) ->  b-a;
        // incr -> p1 - p2
        // decr -> p2 - p1
        TreeMap<Integer,Integer> tm = new TreeMap<>((a,b) ->  b-a);
        tm.put(7,1);
        tm.put(77,1);
        tm.put(177,1);
        tm.put(17,1);
        System.out.println(tm);

        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(12);
        list.add(51);
        list.forEach(x -> System.out.println(x));
    }
}
