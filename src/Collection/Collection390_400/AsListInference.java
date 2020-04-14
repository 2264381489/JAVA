package Collection.Collection390_400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 397
 * Created by 22643 on 2020/4/14.
 */
class Snow{}
class Powder extends Snow{ }
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
    public static void main(String[] args) {


        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
//不会成功
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());//令人尴尬的是他成功了,这可能是后来对于java的改进
        List<Snow> snow3=new ArrayList<>();
        Collections.addAll(snow3,new Light(),new Heavy());
        List<Snow> snow4=Arrays.<Snow>asList(new Light(), new Heavy());//用一个线索<Snow>已告诉编译器对于Array.asList的目标类型是什么
    }
}
