package solutions.twoPointer;

/**
 * Created by jaywangs on 2019/4/2
 */
public class T633_judgeSquareSum {
    public static boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int)Math.sqrt(c);
        while (a <= b){
            if (a * a + b * b == c) return true;
            else if (a * a + b * b < c) a++;
            else b--;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(0));
    }
}
