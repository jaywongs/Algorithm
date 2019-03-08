package chapter4;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T64_SumSolutions {
    public static int sum_solution (int n) {
        int sum = n;
        boolean b = (n > 0) && (sum += sum_solution(n - 1)) > 0;
        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sum_solution(10));
    }
}

