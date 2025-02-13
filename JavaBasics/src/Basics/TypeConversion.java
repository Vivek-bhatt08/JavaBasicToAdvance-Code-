package Basics;

public class TypeConversion {
    public static void main(String[] args){
        int a=295;
        byte b= (byte)(a);
        System.out.println(b);

        int i=65;
        System.out.println((char)i);

        float f = 10.14f;  // takes upto 6 decimal
        System.out.println(f);

        //default value in boolean is false, float,double=0.0, char is nothing
        //byte,char if you perform arthematic operation you get answer in integer format only
//        instanceof Operator is additonal in java which is used to check wheather the element is present in the class or not.
    }
}