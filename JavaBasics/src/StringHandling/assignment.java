package StringHandling;

public class assignment {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(5));
        System.out.println(s.length());
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(5));
        System.out.println(s.substring(0,5)+" "+s.substring(5));
        System.out.println(s.replace('l','o'));
        System.out.println(s.replace("l","o"));
        System.out.println(s.toLowerCase());
    }
}
