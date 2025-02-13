package VarArgsInFunction;

public class ambiguityInVarArgs {
    static void sum(boolean ...a){
        System.out.println(a);
    }
    static void sum(int ...num){
        int sum=0;
        for(int i:num){
            sum+=i;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
//        sum(); here is ambiguity
        sum(0);
    }
}
