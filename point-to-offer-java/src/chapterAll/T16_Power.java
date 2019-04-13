package chapterAll;

/**
 * Created by jaywangs on 2019/4/11
 */
public class T16_Power {
    public double Power(double base, int exponent) {
        boolean isNegative = false;
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        if (exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double res = Power(base * base, exponent >> 1);
        if (exponent % 2 == 1)
            res *= base;
        return isNegative ? 1 / res : res;
    }

}

