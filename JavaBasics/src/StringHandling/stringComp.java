package StringHandling;

public class stringComp {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);         //compares references
        System.out.println(s1.equals(s3));  //Compares values
    }
}
