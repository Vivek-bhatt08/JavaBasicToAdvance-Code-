package StringHandling;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter a string:");
        String s=input.nextLine();
        int i=0,j=s.length()-1;
        int flag=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
