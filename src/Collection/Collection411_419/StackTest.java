package Collection.Collection411_419;

import java.util.Stack;

/**
 * 413
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        for (String s:"my dog is mine".split(" ")
             ) {
            stack.push(s);
        }
        System.out.println(stack);
    }
}
