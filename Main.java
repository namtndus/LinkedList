import collection.MyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        while (list.hasNext()){
            System.out.println(list.next());
        }

        list.delete(2);
        System.out.println();
        while (list.hasNext()){
            System.out.println(list.next());
        }

        System.out.println();
        System.out.println(list.get(0));
    }
}
