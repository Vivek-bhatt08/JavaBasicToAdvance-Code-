package Basics;

import java.util.Scanner;

public class IpOpArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many elements you want to enter in array: ");
        int n=input.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();   //taking input using loop
        }

        for(int i:arr){
            System.out.print(i+" ");  //printing output using forEach loop
        }


        System.out.println("length of the array is : "+ arr.length);  // accessing length of the array

    }
}
