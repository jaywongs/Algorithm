package chapter4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaywangs on 2019/2/26
 */
public class T49_GetUglyNum {
    private static boolean isUgly(int number){
        while (number % 2 == 0)
            number /= 2;
        while (number % 3 == 0)
            number /= 3;
        while (number % 5 == 0)
            number /= 5;
        return number == 1;
    }

    public static int GetUglyNumber_Solution(int index){
        if(index <= 0)
            return 0;

        int number = 0;
        int count = 0;
        while(count < index){
            number++;
            if(isUgly(number)){
                count++;
            }
        }

        return number;
    }

    public static int GetUglyNumber_Solution2(int index) {

        List<Integer> list = new ArrayList();
        list.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (list.size() < index){
            int m2 = list.get(i2) * 2;
            int m3 = list.get(i3) * 3;
            int m5 = list.get(i5) * 5;
            int min = Math.min(Math.min(m2, m3), m5);
            if (m2 == min) {
                i2++;
            }
            if (m3 == min) {
                i3++;
            }
            if (m5 == min) {
                i5++;
            }
            list.add(min);
        }
        return list.get(index - 1);
    }
        public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution2(1500));
    }
}
