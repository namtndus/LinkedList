package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyLinkedList <E> implements Iterator {

    Node head;
    int size = 0;
    int position = 0;

    @Override
    public boolean hasNext() {
        if(position >= size){
            position = 0;
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return get(position++);
    }

    class Node{
        E data;
        Node nextNoed;

        Node(E data){
            this.data = data;
        }
    }

    public void add(E data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node tempNode = head;
            while(tempNode.nextNoed != null){
                tempNode = tempNode.nextNoed;
            }
            tempNode.nextNoed = newNode;
        }
        size++;
    }

    public E get(int index){
        int num = 0;
        Node tempNode = head;
        while(tempNode != null){
            if(num++ == index){
                return tempNode.data;
            }
            tempNode = tempNode.nextNoed;
        }
        throw new NoSuchElementException();
    }

    public E delete(int index){
        int num = 0;
        Node preNode;
        Node tempNode = head;
        while(tempNode.nextNoed != null){
            preNode = tempNode;
            tempNode = tempNode.nextNoed;
            num++;
            if(num == index){
                preNode.nextNoed = tempNode.nextNoed;
                size--;
                return tempNode.data;
            }
        }
        throw new NoSuchElementException();
    }
}
