package List.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwriteArraylist {
    public static void main(String[] args) {
        //it uses when you have to change something while reading for example
        CopyOnWriteArrayList<String> cp = new CopyOnWriteArrayList<>(Arrays.asList("apple","mango","Grapes"));
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("apple","mango","Grapes"));

        for(String val: arr){
            if(val.equals("apple")){
//                arr.remove("apple");          // it will give error because you are reading
//                arr.add(1,"red");             and modifying it concurrently
                                                //but it can be done in CopyOnWriteArrayList
            }
        }
        System.out.println(arr);

        for(String val: cp){
            if(val.equals("apple")){
                cp.remove("apple");
                cp.add(0,"red");
            }
        }
        System.out.println(cp);

        //How it works?....
        //whenever you have to perform write operation like add and remove
        //it will create new array and perform that operations on it
        //and then change the reference to it so the thread do not get confuse
        // when it is reading the thread will read the old array and after modification
        // it will refered to the new array which is modified

    }
}
