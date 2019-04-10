package solutions.greedy;

/**
 * Created by jaywangs on 2019/4/7
 */
public class T860_LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) return false;
        int cnt5 = 0, cnt10 = 0;
        for (int i = 0; i < bills.length && cnt5 >= 0; i++) {
            if (bills[i] == 5) cnt5++;
            else if (bills[i] == 10) {
                cnt10++;
                cnt5--;
            }else {
                if (cnt10 > 0)
                    cnt10--;
                else {
                    cnt5 -= 2;
                }
                cnt5--;
            }
        }
        return cnt5 >= 0;
    }

    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,10,10,20}));
    }
}
