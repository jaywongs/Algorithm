package chapterAll;

import java.util.Arrays;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T66_Multiply {
    public static int[] multiply(int [] A) {
        int n = A.length;
        int [] B = new int [n];

        for (int i = 0, product = 1; i < n; product *= A[i],++i)
            B[i] = product;
        for (int i = n - 1, product = 1; i >= 0; product *= A[i], i--)
            B[i] *= product;
        return B;
    }

    public static int[] multiply2(int[] A) {
        int index = 0;
        int n = A.length;
        int [] B = new int[n];
        Arrays.fill(B, 1);
        while (index < n) {
            for (int i = 0; i < index; i++){
                B[index] *= A[i];
            }
            for (int i = index + 1; i < n; i++){
                B[index] *= A[i];
            }
            index++;
        }
        return B;
    }

    public static void main(String[] args) {
        int [] a = {3,4,5,6};
        System.out.println(Arrays.toString(multiply(a)));
        System.out.println(Arrays.toString(multiply2(a)));

    }

}
