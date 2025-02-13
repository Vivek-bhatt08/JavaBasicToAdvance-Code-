package VarArgsInFunction;

import java.util.Arrays;

class MathOperations{
    public void findSum(int ...num){
        int sum=0;
        for(int i:num){
            sum+=i;
        }
        System.out.println("sum is: "+sum);
    }
    public void findMax(int ...num){
        int max=num[0];
        for(int i:num){
            if(max<i){
                max=i;
            };
        }
        System.out.println("Max is: "+max);
    }
    public void findMin(int ...num){
        int min=num[0];
        for(int i:num){
            if(min>i){
                min=i;
            };
        }
        System.out.println("Min is: "+min);
    }
    public void printNumber(float ...num){
        System.out.println(Arrays.toString(num));
    }
}

public class Assignment_{
    public static void main(String[] args) {
        MathOperations m1=new MathOperations();
        m1.findSum(1,2,3,4,5);
        m1.findMax(1,2,3,4,5);
        m1.findMin(1,2,3,4,5,6);
        m1.printNumber(1,2,3,4,5,6,7,8,9,1000000.25f);
    }
}