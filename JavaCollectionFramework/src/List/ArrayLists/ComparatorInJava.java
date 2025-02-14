package List.ArrayLists;

import java.util.Comparator;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class StrLenComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // Compare based on length
    }
}

public class ComparatorInJava {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Kiwi", "Mango", "Orange");

        // Sorting using custom comparator
//        Collections.sort(words, new StrLenComp());
        // or
        words.sort(new StrLenComp());

        System.out.println(words); // Output: [Kiwi, Apple, Mango, Banana, Orange]
    }
}
