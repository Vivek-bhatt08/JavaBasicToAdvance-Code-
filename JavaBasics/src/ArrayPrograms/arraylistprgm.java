package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistprgm {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        System.out.println(Arrays.toString(arr.toArray()));
//        arraylist methods
        System.out.println(arr.get(0));
        System.out.println(arr.size());
        System.out.println(arr.contains(1));
        System.out.println(arr.indexOf(1));
        System.out.println(arr.remove(1));
        System.out.println(arr.remove(Integer.valueOf(1)));
        System.out.println(arr.isEmpty());
        arr.clear();


    }
}
