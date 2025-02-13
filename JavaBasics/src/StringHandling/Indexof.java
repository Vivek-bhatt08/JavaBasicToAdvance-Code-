package StringHandling;

public class Indexof {
    public static void main(String[] args) {
        String s="How are you?";
        int i=s.indexOf("o");
        System.out.println(i);                      //1
        int j=s.indexOf("o",5);     //9
        System.out.println(j);
        int k=s.indexOf("o",10);    //-1
        System.out.println(k);
    }
}
