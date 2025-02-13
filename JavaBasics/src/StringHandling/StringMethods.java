package StringHandling;

public class StringMethods {
    public static void main(String[] args) {
        /*
        1.length- for array
        2.length()-for strings
        */
        System.out.println("Length function:");
        String s1="abc";
        System.out.println(s1.length());
        String s2="Abc";

        System.out.println("Equals Functions:");
        System.out.println(s2.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.charAt(2));

        System.out.println("Concat Functions:");
        String s3=s1.concat(s2);
        System.out.println(s3);

        System.out.println("Replace Functions:");
        String s4=s1.replace('a','@'); //also we can give string to the function it
        System.out.println(s4);                         //will replace for you

        System.out.println("SubString Functions:");
        String s5=s1.substring(1,3);
        System.out.println(s5);

        System.out.println("uppercase and lowercase");
        String s6=s1.toLowerCase();
        System.out.println(s6);
        String s7=s1.toUpperCase();
        System.out.println(s7);

        System.out.println("trim function");
        String s8=s1.trim();
        System.out.println(s8); //we also have ltrim and rtrim

        System.out.println("Start with, end with, contains, index of");
        String s9="hello vivek";
        System.out.println(s9.indexOf('v'));
        System.out.println(s9.startsWith("hello"));
        System.out.println(s9.endsWith("vivek"));
        System.out.println(s9.contains("vivek"));
        System.out.println(s9.startsWith("hi"));

        System.out.println("Compare to function");
        String s10="ABCDE";
        String s11="ABCDE";
        String s12="ABCJH";
        System.out.println(s10.compareTo(s11));
        System.out.println(s10.compareTo(s12));  //-6 difference bw ascii codes
        System.out.println(s12.compareTo(s10)); //6 difference bw ascii code of j and d
        System.out.println(s10.compareToIgnoreCase(s12));
//        difference bw capital a and small a is 32
//        in ignore case if you compare a to A then op is 0


    }
}
