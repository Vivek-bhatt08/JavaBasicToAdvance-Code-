package Basics;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
/*
        int arr1[];
        int[] arr2;                                 //ways of initializing array
        int arr3[]={2,4,6,8};
        int arr4[]=new int[]{2,4,6,8,10};           //intializing and declaring

        int[] arr=new int[]{1,2,3,4,5};             //here you can not give the size of array
        System.out.println(Arrays.toString(arr));
*/
        Scanner input=new Scanner(System.in);
        System.out.print("How many elements you want to enter in array: ");
        int n=input.nextInt();

        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=input.nextInt();
        }

        System.out.println("length of the array is : "+ arr.length);
    }
}
