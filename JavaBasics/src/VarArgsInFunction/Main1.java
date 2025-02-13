package VarArgsInFunction;

public class Main1 {
    static void sum(String name,int ...num){
        int sum=0;
        System.out.println("Name "+name);
        for(int i:num){
            sum+=i;
        }
        System.out.println("Sum is: "+sum);
    }

    public static void main(String[] args) {
        sum("Vivek");
        sum("yuvraj",1,2,3);
        int[] arr={1,2,3,4,5};    
        sum("vivek",arr);

    }
}
