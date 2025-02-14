package List.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArraylistMethods {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(); //can write this because list is the parent class of arraylist
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // or we can access via foreach loop

        l.add(1,5);
        System.out.println(l);

        l.set(1,8);
        System.out.println(l);

        System.out.println(l.size()); //size is current size but there is capacity also

        l.remove(1);  // index or any value in object form
        System.out.println(l);

        l.remove(Integer.valueOf(3));  //for making 3 integer as a object
        System.out.println(l);

        boolean has= l.contains(0);
        System.out.println(has);



    }
}
