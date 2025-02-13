package Basics;//public class TakingInput {
//1. package java.io.Console
//step1- import package  ==> (import java.io.*;)==>it imports all the classes;
//so we import only required class ==> import.io.Console
//step2- Create object of Console class ==> Console con=System.console();
//step3- Call readLine() ==> con.readLine("msg");
//you can also combine step1 and step3 ==> System.console().readLine("msg");


//    public static void main(String[] args) {
//        String s1=System.console().readLine("Enter first number");
//        String s2=System.console().readLine("Enter Second number");
//        int num1=Integer.parseInt(s1);                            // it will not run on intellij idea because
//        int num2=Integer.parseInt(s2);                            // they do not have console package
//        int sum=num1+num2;
//        System.out.println(sum);
//    }


//}
public class TakingInput{
    public static void main(String[] args){
        String name=System.console().readLine("Enter name : ");
        String i2=System.console().readLine("Enter age : ");
        String course=System.console().readLine("Enter course : ");
        String i4=System.console().readLine("Enter marks : ");
        int age=Integer.parseInt(i2);
        float marks=Float.parseFloat(i4);
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
        System.out.println("I am learning "+course+" course");
        System.out.println("I secured "+marks+"% marks in last semester");
    }
}