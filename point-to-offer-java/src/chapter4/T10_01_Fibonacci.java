package chapter4;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T10_01_Fibonacci {
    public int Fibonacci(int n) {
        if (n <= 1) return n;
        int f1 = 0, f2 = 1;
        int sumf = 0;
        for (int i = 2; i <= n; i ++ ){
            sumf = f1 + f2;
            f1 = f2;
            f2 = sumf;
        }
        return sumf;
    }
}
