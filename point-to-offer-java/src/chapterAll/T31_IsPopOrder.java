package chapterAll;

import java.util.Stack;

/**
 * Created by jaywangs on 2019/3/5
 */
public class T31_IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int n = popA.length;
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex ++) {
            stack.push(pushA[pushIndex]);
            while(!stack.isEmpty() && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex ++;
            }
        }
        return stack.isEmpty();
    }
}
