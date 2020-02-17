package Generic.Generic_627;

/**
 *
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        //getclass得到目标类对象，getSimplename得到类名 id是常量每生成一个Coffee对象，加一
        return getClass().getSimpleName() + "" + id;
    }
}
