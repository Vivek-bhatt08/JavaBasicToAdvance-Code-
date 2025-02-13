package Basics;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
//        Each row have different number of columns here
//        int arr[][]=new int[4][];   rows is defined here but we can define columns according to us.
//        arr[0]=new int[no of columns you need in that particular row];
//        int arr[][]=new int[4][];
//        arr[0]=new int[3];
//        arr[1]=new int[4];                    initializing array according to us
//        arr[2]=new int[2];
//        arr[3]=new int[1];
        Scanner input=new Scanner(System.in);
        int arr[][]=new int[4][];
        arr[0]=new int[3];
        arr[1]=new int[4];
        arr[2]=new int[2];
        arr[3]=new int[1];
        System.out.println("Enter array elements:");
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("elements are:");
        for(int[] i:arr){
            for(int val:i){
                System.out.print(val+" ");
            }
            System.out.println();
        }

    }
}
