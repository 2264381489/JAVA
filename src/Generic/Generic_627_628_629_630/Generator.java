package Generic.Generic_627_628_629_630;

/**
 * 一个借口类
 * @param <T>
 */
public interface Generator<T> {
    T next() throws IllegalAccessException, InstantiationException;

}
