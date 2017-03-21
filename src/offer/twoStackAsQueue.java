package offer;

import java.util.Stack;

/**
 * Created by liangnan on 17/3/18.
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class twoStackAsQueue {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int node) {
        stack1.push(node);
    }

    public static int pop() {

        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            push(i);
        for(int i = 0; i < 3; i++)
            System.out.println(pop());
        for(int i = 10; i < 15; i++)
            push(i);
        for(int i = 0; i < 7; i++)
            System.out.println(pop());
    }
}
