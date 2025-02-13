package StringHandling;

import java.util.Arrays;

public class getCharacterArray {
    public static void main(String[] args) {
        String s="hi how are you?";

        char[] ch=s.toCharArray();
        for(char c:ch){
            System.out.print(c+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ch));
    }
}
