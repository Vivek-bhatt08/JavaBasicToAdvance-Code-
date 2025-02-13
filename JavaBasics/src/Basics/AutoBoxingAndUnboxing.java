package Basics;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        float a=1.23f;
        Float b=a;  //Auto-Boxing
        float c=b;  //Auto-Un-Boxing
        System.out.println("a = "+a+" b = "+b+" c = "+c);
    }
}
