package List.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ListofMethod {
    public static void main(String[] args) {
        Integer[] arr={12,3,5};   //we have to use object because List.of(object) parameter takes object
        List<Integer> lst = List.of(arr);  //it is unmodifiable
        System.out.println(lst);

//        lst.set(0,0);             it will give error because it is fully unmodifiable we can't modify it
//        System.out.println(lst);

        //for modifying
        ArrayList<Integer> arrlst = new ArrayList<>(lst); //now it is modifiable
        System.out.println(arrlst);
        arrlst.add(10);
        System.out.println(arrlst);

    }
}
