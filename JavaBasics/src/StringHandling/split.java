package StringHandling;

import java.util.Arrays;
import java.util.Scanner;

public class split {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=input.nextLine();
        System.out.println("original string is: "+s);
        System.out.println();

        String[] arr=s.split(" ");
        System.out.print("split string on base of space is:");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("number of words are: "+arr.length);
        System.out.println();

        int vowelCount=0;
        int consCount=0;
        int sp=0;
        String[] arr1=s.split("");
        System.out.println("Spilt string on basis of chars is:");
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        for(String i:arr1){
            if(i.equals("a")||i.equals("e")||i.equals("i")||i.equals("o")||i.equals("u")) {
                vowelCount++;
            }
            else if ( i.equals(" ")) {
                sp++;
            }
            else {
                consCount++;
            }
        }
        System.out.println("no of vowels are: "+vowelCount);
        System.out.println("no of consonants are: "+consCount);
        System.out.println("no of spaces are: "+sp);

        System.out.print("enter string to find char:");
        String str=input.nextLine();
        System.out.print("enter character to find:");
        char ch=input.nextLine().charAt(0);
        System.out.println("Your entered character is: "+ch+"at index : "+str.indexOf(ch));

    }
}
