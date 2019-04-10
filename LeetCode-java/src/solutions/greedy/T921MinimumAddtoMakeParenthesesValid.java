package solutions.greedy;

import java.util.Stack;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T921MinimumAddtoMakeParenthesesValid {
    public static int minAddToMakeValid(String str) {
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                stack.push('(');
            }else {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    cnt++;
            }
        }
        return stack.size() + cnt;
    }

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("))(()"));
    }
}
