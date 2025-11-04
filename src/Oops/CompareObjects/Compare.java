package Oops.CompareObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        //sort on the basis of unit digits
        //if unit digit is same then print the smaller number first
        arr.add(12);
        arr.add(20);
        arr.add(15);
        arr.add(47);
        arr.add(53);
        Compare c1 = new Compare();
        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //if 1 then swap  -> +ve
                //if 0 or -1 then don't swap  -> -ve
                int u1 = o1%10;
                int u2 = o2%10;
                if(u1 == u2){
                    return o1-o2;     //increasing order
                }
                return u1-u2;
//                if(u1 < u2){
//                    return -1;
//                } else if(u1 > u2){
//                    return 1;
//                } else{
//                    if(o1 < o2){
//                        return -1;
//                    } else if(o1 > o2){
//                        return 1;
//                    }
//                }
//                return 0;
            }
        };
        Collections.sort(arr,cmp);
        c1.display(arr);
    }
    public <T> void display(ArrayList<T> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
            if(i != list.size() - 1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
