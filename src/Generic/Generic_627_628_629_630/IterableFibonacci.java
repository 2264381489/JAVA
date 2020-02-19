package Generic.Generic_627_628_629_630;

import java.util.Iterator;

/**
 * 630
 * 630与629有何不同。
 * 629的运行方式是依靠下面的for来实现对每个斐波那数的运算。其核心是count。依靠count数值的变化，不断地运行递归
 * 630则是依靠foreach来运作，也就是实现了Iteable接口。
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
  public int n;//要计算几位的Fibonacci
  //构造函数，输入位数
   public IterableFibonacci(int count){
       this.n=count;
   }
//迭代器，采用了适配器
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            //哨兵，判断有没有结尾
            @Override
            public boolean hasNext() {
                return n>0;
            }
            //移动，调用父类的next方法中的fib方法进行计算。
            //父类方法： public Integer next(){return fib(count++);}
            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next() ;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
       for(int i:new IterableFibonacci(18)) System.out.println(i+"");

    }
}
