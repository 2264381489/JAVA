package Generic.Generic_627_628_629_630;

/**
 *
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    public Coffee() {
    }

    @Override
    public String toString() {
        //getclass得到目标类对象，getSimplename得到类名 id是常量每生成一个Coffee对象，加一
        return getClass().getSimpleName() + "" + id;
    }
}
