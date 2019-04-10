package huawei;

import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/10
 */
public class SumOfInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        int cnt = 0;
        for (char c : str.toCharArray()){
            if (c == '-'){
                cnt++;
            }else if (Character.isDigit(c)){
                sum += cnt % 2 == 0 ? Character.getNumericValue(c) : -Character.getNumericValue(c);
                cnt = 0;
            }
        }
        System.out.println(sum);
    }
}
