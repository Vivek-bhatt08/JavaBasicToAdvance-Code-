package StringHandling;

public class StringHandle {
//    String is collection of characters
//    it is represented as an object of a class names string available in java.lang package
//    String is immutable
//    StringBuilder and StringBuffer are mutable
public static void main(String[] args) {
    String s1="Hello";
    String s2=new String("Kyu nhi hori padhai ...");
    System.out.println(s1);
    System.out.println(s2);

    char ch[]={'a','b','c','d','e','f'};
    String s3=new String(ch);
    System.out.println(s3);

    String s4=new String(ch,1,3);  //String(char_arr,start idx,noOfChars)
    System.out.println(s4);

    byte arr[]={66,67,97,98};
    String s5=new String(arr);
    System.out.println(s5);


    String s7=new String("Hello");
    System.out.println(s7.equals(s1));
    System.out.println(s7.equalsIgnoreCase(s1));
    System.out.println(s7.charAt(2));


}

}
