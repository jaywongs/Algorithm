package solutions.dynamicProgramming;

/**
 * Created by jaywangs on 2019/4/26
 */
public class T357_CountNumberswithUniqueDigits {
    /**
     * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10^n.
     *
     * Example:
     *
     * Input: 2
     * Output: 91
     * Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100,
     *              excluding 11,22,33,44,55,66,77,88,99
     **/

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 9;
        for (int i = 9; i >= 11 - n; i--) {
            res *= i;
        }
        return res + countNumbersWithUniqueDigits(n - 1);
    }
}
