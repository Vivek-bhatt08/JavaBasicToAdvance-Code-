package Basics;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int flag=0;
        for (int i=2; i<num; i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("composite number");
        }
        else {
            System.out.println("number is prime");
        }
    }
}
