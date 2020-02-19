package Generic.Gneric631;

/**
 * 631
 * 泛型方法
 * 当使用泛型类是，必须在创建对象的时候指定类型参数的值，而是泛型方法的时候，通常不必指明参数类型，因为编译器会为我们找出具体的类型，成为类型参数推断。
 */
public class GeneratorMethod {
    public <T> void f(T x){
        //输入任意一个类型的数据，获取她的类对象，输出他的名字
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GeneratorMethod generatorMethod = new GeneratorMethod();
        generatorMethod.f("");
        generatorMethod.f(12);
        generatorMethod.f(1.0);
        generatorMethod.f(1.0F);
        generatorMethod.f("c");

    }

}
