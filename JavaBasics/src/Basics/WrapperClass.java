package Basics;

public class WrapperClass {
    public static void main(String[] args) {
//        wrapper class-using wrapper class we can represent our primitive data types in the form of objects.
        Integer a=20;   // or Integer obj1= new Integer(20);  both are same
        int b=a.intValue();
        System.out.println(a);
        System.out.println(b);


        Float c=12.23f;
        float d=c.floatValue();
        System.out.println(c);
        System.out.println(d);
    }
}
