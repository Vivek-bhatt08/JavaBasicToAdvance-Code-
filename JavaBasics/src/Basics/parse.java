package Basics;//public class parse {
//    public static void main(String[] args) {
//        String str1="12";
//        str1+=2;
//        System.out.println(str1);
//        int a= Integer.parseInt(str1);  it is a integer value that why it is converted if it is "hello" or any
//        a+=2;                            other string it will give number format error
//        System.out.println(a);
//    }
//}

public class parse{
    public static void main(String[] args) {
        String s1="12.34";
        String s2="13.34";
        double a=Double.parseDouble(s1);
        double b=Double.parseDouble(s2);
        System.out.println(a+b);
    }
}