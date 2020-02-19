package Generic.Generic_635_636_637_638;
/**
 * 638
 * 对于637的测试。
 */

import Generic.Generic_627_628_629_630.Coffee;

public class BasicGenerationDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        BasicGenerator<Coffee> coffeeBasicGenerator = (BasicGenerator<Coffee>) BasicGenerator.create(Coffee.class);
        for(int i=0;i<5;i++){
            System.out.println(coffeeBasicGenerator.next());
        }
    }
}
