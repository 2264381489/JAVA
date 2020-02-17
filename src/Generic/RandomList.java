package Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * 626
 * 可以随机的选取一个元素
 * @param <T>
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();//存储导入的数据
    /*
   所以可以这么理解理解这个“47”：Random的含参构造器里的参数是一种随机数生
   成规则，此后Random对象都依照这个规则生成随机数，故当然这个每次运行的结果都一致。当然这个“47”是可以改变数值的。
*/
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }//后面那个add是ArrayList中的方法(用数组中的方法，加入元素)

    public T select() {
        //E get(int index)
        //返回此列表中指定位置的元素


        //int nextInt(int bound)
        //返回伪随机的，均匀分布 int值介于0（含）和指定值（不包括），从该随机数生成器的序列绘制。
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();//声明目标类
        //public String[] split(String regex)将此字符串拆分为给定的regular expression的匹配。
        //该方法的工作原理是通过使用给定表达式和限制参数为零调用双参数split方法。 因此，尾随的空字符串不会包含在结果数组中。
        //
        //例如，字符串"boo:and:foo"使用以下表达式得到以下结果：
        //
        //Regex Result
        //: { "boo", "and", "foo" }
        //o { "b", "", ":and:f" }
        //
        //参数
        //regex - 分隔正则表达式
        for (String s : ("The quick brown fox jumped over" + "the lazy brown dog").split(" ")) {
            rs.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(rs.select() + "");
        }


    }
}
