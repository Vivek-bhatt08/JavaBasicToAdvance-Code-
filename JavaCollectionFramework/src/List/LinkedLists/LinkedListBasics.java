package List.LinkedLists;

import java.util.LinkedList;

//ll stores node which contains an element and the reference to the next element
//java has its own ll which is doubly linked list which contains previous and next element reference
//it is a linear data structure


// used for deletion and insertion kyuki sirf hme pointer is change krna hota hai
//continuous memory location ni hoti pointer reference hote
public class LinkedListBasics {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addFirst(0);
        ll.addLast(3);
        System.out.println(ll);

        ll.set(2,15);
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        ll.add(0);
        ll.add(5);
        System.out.println(ll);

        ll.removeIf(x -> x==0);
        System.out.println(ll);

        System.out.println(ll.get(1));
    }
}
