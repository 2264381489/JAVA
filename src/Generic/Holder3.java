package Generic;

/**
 * 620号代码
 * 如何定义一个泛型类
 * 创建holder3的时候必须指明想持有什么类型的对象，将其置于尖括号内。你只能在holder3中存入该类型。
 * @param <T>
 */
public class Holder3<T> {
    private T a;
    public void Holder3(T a){};
    public  void set(T a){ this.a=a;  }
    public T get(){return a;}

    public static void main(String[] args) {
        Holder3<Integer> holder3=new Holder3<Integer>();
        holder3.set(12);

        holder3.get();
        System.out.println(holder3.get());

    }
}
