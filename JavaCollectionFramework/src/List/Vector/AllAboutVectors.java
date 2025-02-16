package List.Vector;

import java.util.Vector;

public class AllAboutVectors {
    public static void main(String[] args) {
        Vector<Integer> vec =  new Vector<>();  //synchronized...
        System.out.println("Initial Capacity: "+ vec.capacity());

        Vector<Integer> vec1 = new Vector<>(3,2);//default 2x se bdti hai
        System.out.println("Given Capacity:"+vec1.capacity());
        vec1.add(1);
        vec1.add(1);
        vec1.add(1);
        System.out.println(vec1.capacity());
        vec1.add(1);
        System.out.println(vec1.capacity());

        System.out.println("------------------------------");

        System.out.println(vec1.isEmpty());

        System.out.println("after using vec1.clear()...");
        vec1.clear();
        System.out.println(vec1.isEmpty());

        System.out.println("all list methods you can use here ");

        System.out.println("vector : "+vec);
        vec.add(1);
        vec.add(5);
        System.out.println("vector : "+vec);

    }
}
