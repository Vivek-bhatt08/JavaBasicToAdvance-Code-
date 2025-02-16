package List.Stack;

import java.util.Stack;

//it extends vector so it is synchronized also and we can use all vector methods here
public class AllAboutStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //no initial capacity
        stack.add(5);
        System.out.println(stack);

        stack.push(1);  //used for that type of specific methods
        System.out.println(stack);

        for (int i=0; i<5; i++){
            stack.push(i);
        }
        System.out.println(stack);
        int peekele = stack.peek();
        System.out.println("Top most element in the stack: "+peekele);

        stack.pop();
        System.out.println("after pop last element which is 4: "+stack);

        System.out.println("searching element and it uses 1 indexing: "+stack.search(5));
        //upr se search krta hai

    }

}
