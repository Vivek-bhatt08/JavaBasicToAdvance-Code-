package Basics;

public class BitwiseOperator {
    public static void main(String[] args) {
        // or and xor compliment, left shift, signed right shift, unsigned right shift
        // |   &   ^      ~            <<              >>                    >>>

        System.out.println(12|25); // it converts 12 and 25 to binary then perform bitwise operation
                                    // and answer in bit and get converted to decimal again
        System.out.println(12&25);

        System.out.println(12^25); // if both same then false eg 0 0 , 1 1;

        System.out.println(~40); //op is -36 because if we take 35 1's compliment and the
        //-(n+1) is the output   // left most bit is 1 then the number is negative.
                                //if number is negative then we add 1 to it to take its 2's compliment
                                // the answer after the 2's compliment is your output which is -(36)

        System.out.println(2<<2); //(number<<no.of shifts)  no.of shifts= utne zero bits krdo right end pe
                                                            // number=us no ko binary me convert me krke
                                                            // agge se no.of shifts jitne bits hta do

        System.out.println(-8>>2);  //signed right shift operator

        System.out.println(); //unsigned right shift it does't look for number sign
                                // whether it is positive or negaive
    }
}
