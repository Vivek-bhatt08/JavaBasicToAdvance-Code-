package StringHandling;

public class getChars {
    public static void main(String[] args) {
        String s="Hello World";
        char[] ch=new char[10];
        s.getChars(0,5,ch,0);
        //s.getchars(startidx,endIdx,chararr,kha se element dalna shuru krna)
        System.out.println(ch);

    }
}
