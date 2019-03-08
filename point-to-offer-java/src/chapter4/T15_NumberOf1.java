package chapter4;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T15_NumberOf1 {
    public static int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt ++;
            n &= (n-1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.print(NumberOf1(130009876));
    }
}
