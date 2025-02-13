package StringHandling;

public class LastIndexof {
    public static void main(String[] args) {
        String s="How are you?";
        int i=s.lastIndexOf("o");
        System.out.println(i);
        System.out.println(s.lastIndexOf("y",5));
    }
}
