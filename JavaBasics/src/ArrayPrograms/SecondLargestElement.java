package ArrayPrograms;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many elements you want to enter:");
        int n=input.nextInt();
        System.out.println("enter elements here:");
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        int SecondMax=arr[0];
        for (int j : arr) {
            if (SecondMax < j && max != j) {
                SecondMax = j;
            }
        }
        System.out.println("second largest element is : "+SecondMax);
    }
}
