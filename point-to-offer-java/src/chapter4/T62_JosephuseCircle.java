package chapter4;

/**
 * Created by jaywangs on 2019/3/1
 */
public class T62_JosephuseCircle {
    public int lastRemining(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i <= n; i++)
            last = (last + m) % i;
        return last;
    }

    public int lastReminingRecurisive(int n, int m) {
        if (n == 0) return -1;
        if (n == 1) return 0;
        return (lastReminingRecurisive(n - 1, m) + m) % n;
    }
}
