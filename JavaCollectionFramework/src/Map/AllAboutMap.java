package Map;

import java.util.HashMap;
import java.util.Map;

public class AllAboutMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vivek", 2562);
        map.put("vinay", 2560);
        map.put("yuvraj", 2569);

        // Corrected loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) { //ye map import krne pe ayega
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println(map.containsKey("vivek"));
        System.out.println(map.containsValue(2560));

        System.out.println("----------------------------");

        map.putIfAbsent("uday",2550);
        map.put("uday",2551);

        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println(map.get("vivek")); //you have to pass key
//        map.equals();
        int res= map.getOrDefault("myname",0);
        System.out.println(res);
        System.out.println(map.isEmpty());
        map.replace("vivek",2562,62);
        System.out.println("after replacing : ");
        for(Map.Entry<String,Integer> val : map.entrySet()){
            System.out.println(val.getKey()+":"+val.getValue());
        }


        System.out.println(map.size());

    }
}
