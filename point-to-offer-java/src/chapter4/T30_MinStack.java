package chapter4;

import java.util.Stack;

/**
 * Created by jaywangs on 2019/3/27
 */
public class T30_MinStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
        if(stack2.isEmpty())
            stack2.push(node);
        else {
            if (stack2.peek() >= node)
                stack2.push(node);
            else
                stack2.push(stack2.peek());
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}
