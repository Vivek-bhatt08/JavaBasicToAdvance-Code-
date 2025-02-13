package ArrayPrograms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner input =new Scanner(System.in);
        System.out.print("Enter element to found:");
        int n=input.nextInt();
        int flag=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                System.out.println("Element found at index: "+i);
                flag=0;
                break;
            }
            else{
                flag=1;
                continue;
            }
        }
        if(flag==1){
            System.out.println("Not found");
        }
    }
}
