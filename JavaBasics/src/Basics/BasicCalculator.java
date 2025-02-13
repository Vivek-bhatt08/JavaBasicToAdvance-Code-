package Basics;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();

        System.out.println("a = "+a+" "+b);
        System.out.println("Additions is: "+(a+b));
        System.out.println("Subtraction is: "+(a-b));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
    }
}
