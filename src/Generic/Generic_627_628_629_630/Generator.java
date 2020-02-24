package Generic.Generic_627_628_629_630;

/**
 * 一个接口类，使用了泛型。可以看到他next方法的返回的类型被直接规定成了T。
 * 这个是生成器接口
 * @param <T>
 */
public interface Generator<T> {
    T next() throws IllegalAccessException, InstantiationException;

}
