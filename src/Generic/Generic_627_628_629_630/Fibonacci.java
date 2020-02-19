package Generic.Generic_627_628_629_630;

/**
 * 629
 * 斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入
 * ，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、
 * 如果设an为该数列的第n项（ ），那么这句话可以写成如下形式：https://baike.baidu.com/item/%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0%E5%88%97/99145?fr=aladdin
 * 基本类型不能作为类型参数
 */
public class Fibonacci implements Generator<Integer>  {
    private int count=0;//计数器，用来让fib可以输出不同的数据
    //注意这个是public的，可以被外部调用，并使用私有的fib方法
    public Integer next(){return fib(count++);}
//递归方法，循环调用fib来解决问题。

    /**
     * 例子：
     * a1=1;
     * a2=1;
     * a5=a4+a3;
     * a5=(a3+a2)+(a2+a1)
     * a5=((a2+a1)+a2)+a2+1
     * @param i
     * @return
     */
    private Integer fib(int i) {
         if (i<2) return i;
        return fib(i-1)+fib(i-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i=0;i<18;i++){
            //同一个对象调用next方法，会导致增加。只有建立新的对象，count才会刷新
            System.out.println(fibonacci.next()+"");
        }
    }

}
