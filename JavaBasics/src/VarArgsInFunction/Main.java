package VarArgsInFunction;

public class Main {
    static void sum(int ...num){
        int sum=0;
        for(int i:num){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println("Total argument you entered: "+ num.length);
    }

    public static void main(String[] args) {
        sum(1,2,5,8,4,6);
    }
}
