/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example:
 *
 * Input: 43261596
 * Output: 964176192
 * Explanation: 43261596 represented in binary as 00000010100101000001111010011100,
 *              return 964176192 represented in binary as 00111001011110000010100101000000.
 * Follow up:
 * If this function is called many times, how would you optimize it?
 **/
package solutions;

public class ReverseBits {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        int i = 0;
        while (n > 1) {
            res += (n % 2) * Math.pow(2, 32 - i);
            n /= 2;
            i++;
        }
        return res;
    }

    public static int reverseBits2(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits2(43261596));
    }
}
