package StringHandling;

public class getByteArray {
    public static void main(String[] args) {
        String s="Hello World";
        byte[] b=s.getBytes();
        for(byte bt:b){
            System.out.print((char)bt+" ");
            System.out.print(bt+" ");
        }
    }
}
