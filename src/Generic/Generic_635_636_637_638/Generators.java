package Generic.Generic_635_636_637_638;

import Generic.Generic_627_628_629_630.Coffee;
import Generic.Generic_627_628_629_630.CoffeeGenerator;
import Generic.Generic_627_628_629_630.Fibonacci;
import Generic.Generic_627_628_629_630.Generator;

import java.util.ArrayList;
import java.util.Collection;
//用于Generator的反省方法，利用生成器，我们可以很轻易地填充一个Colection

/**
 * 636
 */
public class Generators {
    //生成器
    public static <T> Collection<T> filld(Collection<T> coll, Generator<T> gen, int n) throws InstantiationException, IllegalAccessException {
        //程序每运行一次，加入一个gen
        for (int i=0;i<n;i++)coll.add(gen.next());
        return coll;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //咖啡
        Generators generator = new Generators();

        System.out.println(generator.filld(new ArrayList<Coffee>(),new CoffeeGenerator(),5));
        //斐波那契数组
        System.out.println(generator.filld(new ArrayList<Integer>(),new Fibonacci(),5));

    }

}
