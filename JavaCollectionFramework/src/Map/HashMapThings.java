package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapThings {
    public static void main(String[] args) {
        Map<Integer,String> hmap = new HashMap<>();

        //you can get elements and put elements in the time complexity of O(1)
        //in worst case the time complexity will be O(logN) which uses red black tree

        //it uses a bucket array to store the key and values..
        //it use a hash function which generate the hashcode from which we can get the bucket array index
        //at that index we can store that key and value
        //if there is collision bw the hashcodes and you get the same index then the two key value pair
        //stored in that index which is connected by linked list
        //like if you have to access that key which is in collision so first you have to go that index
        //then it will search linearly like the linked list does but in java 8 it is done using red black tree

// ============================ Hash Map methods=====================================================
        hmap.put(1,"vivek");
        hmap.put(2,"vinay");

        for(Map.Entry<Integer,String> val: hmap.entrySet()){
            System.out.println(val.getKey()+":"+val.getValue());
        }



    }
}
