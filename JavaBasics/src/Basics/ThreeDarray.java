package Basics;

import java.util.Scanner;

public class ThreeDarray {
    public static void main(String[] args) {
//        collection of 2d array is 3d array
//        int arr[][][]=new int[2][3][4];      2 pages, 3rows, 4columns
//        int[][][] arr=new int[2][3][4];
//        int[][] arr[]=new int[2][3][4];
//        int[] arr[][]=new int[2][3][4];
        Scanner input= new Scanner(System.in);
        int[][][] arr= new int[2][3][4];
        for (int i = 0; i < arr.length; i++) {                  //2
            for (int j = 0; j < arr[i].length; j++) {           //3
                for (int k = 0; k < arr[i][j].length; k++) {    //4
                    arr[i][j][k]=input.nextInt();
                }
            }
        }
    }
}
