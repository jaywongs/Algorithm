package tencent;

import java.util.*;

/**
 * Created by jaywangs on 2019/4/4
 */
public class selectCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, Collections.reverseOrder());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                sum1 += arr.get(i);
            }else
                sum2 += arr.get(i);
        }
        System.out.println(sum1 - sum2);

    }


}
