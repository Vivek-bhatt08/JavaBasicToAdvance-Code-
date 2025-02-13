package ArrayPrograms;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class SortFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr={5,8,6,5,2};
        sort(arr);
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Second largest element is : "+ arr[1]);
    }
}
