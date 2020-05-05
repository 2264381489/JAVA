package Collection.Collection411_419;

import java.util.LinkedList;

/**
 * 412
 * @param <T>
 */
public class Stack<T> {
    private LinkedList<T> storage=new LinkedList<>();//用LinkedList作为栈的核心
    public void push(T v){ storage.addFirst(v);}
    public T peek(){ return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString(){return storage.toString();}
}
