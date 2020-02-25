package Generic_649;

import java.util.ArrayList;

/**
 * 你会发现，原本应该不同的内容，现在竟然完全相同了。
 * 很重要的原因就在于泛型在运行的时候产生的特殊机制，
 * 擦除机制
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args) {
          Class c1=new ArrayList<String>().getClass();
        Class c2=new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);

    }
}
