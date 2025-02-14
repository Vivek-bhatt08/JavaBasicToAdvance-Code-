package List.ArrayLists;

import java.util.Arrays;
import java.util.List;

public class ComparatorUsingLambdaFunc {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("Apple", "Banana", "Kiwi", "Mango", "Orange");
            words.sort((s1,s2) -> s1.length()-s2.length());

            //ensure that the both comparator parameter should have same data type

            System.out.println(words); // Output: [Kiwi, Apple, Mango, Banana, Orange]
        }
}
