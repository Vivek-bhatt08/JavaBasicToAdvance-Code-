package Basics;

public class boxingAndUnboxing {
    public static void main(String[] args) {
        float a=12.23f;
        Float b= new Float(a);  //wrapping a float data type in Float wrapper class is called Boxing
        float c=b.floatValue(); //Unboxing
        System.out.println("a = "+a+" b = "+b+" c = "+c);
    }
}
