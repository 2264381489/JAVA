package Generic;

/**
 *625
 * 泛型类型就是另一种类型罢了
 * 这是一个堆栈类
 * @param <T>
 */
public class LinkedList<T> {
    //内部类，构造一个内部链式储存机制
    private static class Node<U>{
        U item;
        Node<U> next;//存储的是node对象，靠这个可以找到下一个对象
         Node(){ item=null;next=null;}//默认构造器（也不知道是要干啥的）
         Node(U item,Node<U> next) {//构造器，
             this.item = item;
             this.next = next;
         }
        boolean end(){return item==null&&next==null; }//末尾哨兵，确定是否到了结尾
    }
    private Node<T> top=new Node<T>();//只有泛型类中才出现泛型吗？
    //每调用一次push方法，就会创建一个Node<T>对象，，并将其链接到前一个对象中。
    public void push(T item){
        top=new Node<T>(item,top);//top是前一个对象

    }
    //返回top.item，并丢弃当前对象。除非碰到末端哨兵，，这时候就不能移动了，但是要是持续调动还是会返回null
    public T pop(){
        T result=top.item;
        if(!top.end()) {
            top = top.next;}//top被topnext刷新
            return result;//这里的返回值必须和这个方法的泛型类型对应。
    }

    public static void main(String[] args) {
        LinkedList<String> lss=new LinkedList<String>();
        //删除所要输出字段中的空格
        //这个是foreach？（还不太会）
        for (String s:"HELLO WORLD ".split("")){
            lss.push(s);
        }
        String s;//刷新S
        //创造一个用来调用pop的循环
        while((s = lss.pop())!=null)
         {

          //你会发现输出的内容是倒叙的，这叫后进先出
             System.out.print(s);

        }
    }

}
