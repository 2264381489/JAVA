

package Collection.Collection411_419;

/**
 * 414
 */
//import net.mindview.util.*;



public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();//使用自己构成的Stack,注意引入的时候要仔细选择.要不然会导致变成一开始的那种
        for (String s:
             "my dog is mine".split(" ")) {
    stringStack.push(s);
        }
        while(!stringStack.empty()){
            System.out.print(stringStack.pop()+" ");
        }
        System.out.println();

    }
}
