package Basics;

import java.util.Scanner;

public class MultiDimensionArrays {
    public static void main(String[] args) {

//        int arr[][]=new int[3][4];
//        int[] arr[]=new int[3][4];   ways of initializing arrays
//        int[][] arr=new int[3][4];
        Scanner input=new Scanner(System.in);
        System.out.println("enter elements in array of size row x col= 3 x 3");
        int[][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("your array is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

}
