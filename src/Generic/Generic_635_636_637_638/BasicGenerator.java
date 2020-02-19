package Generic.Generic_635_636_637_638;

import Generic.Generic_627_628_629_630.Generator;

/**
 * 637
 * 这个类提供了一个基本实现，用以生成某个类的对象，，有两个必须做到的事情，就是这个诶必须是public的，（因为这个函数和要处理的函数不在一个包中。必须有默认构造器（因为用newIsantance构造的））
 * @param <T>
 *     为什么删掉这个T不报错，但是不删掉T却报错。
 */
public class BasicGenerator<T> implements Generator<T> {
    //这个说的是类型，Class对象类型
    private Class <T> type;

    public BasicGenerator(Class<T> type) {
        this.type=type;
    }
    @Override
    public T next() throws IllegalAccessException, InstantiationException {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    //注意create是static的，可以被类名直接调用
    //这里要是写BasicGenerator被上转为Generator，于是在后面的语句中发生了向下转型。
    public static <T> Generator <T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
