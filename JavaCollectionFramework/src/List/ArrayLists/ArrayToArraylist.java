import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6}; // Use Integer[] instead of int[] becuase it is only for objects
        List<Integer> arrlst = Arrays.asList(arr); //we can only replace or use contains method in it

        //for making it fully modifiable
        List<Integer> l = new ArrayList<>(Arrays.asList(arr));
        //now you can perform all functions on l
        System.out.println(l);
        l.add(7);
        System.out.println(l);

        System.out.println(arrlst);
        arrlst.set(2,2);
        System.out.println(arrlst);
//        arrlst.add(7);
//        System.out.println(arrlst);
    }
}
