package huawei;

import java.util.*;

/**
 * Created by jaywangs on 2019/4/10
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int length = s.length();
            int cnt = length / 8;
            for (int j = 0; j < cnt; j++){
                list.add(s.substring(j, j + 8));
            }
            String tmp = s.substring(8 * cnt, length);
            int k = 8 * (cnt + 1) - length;
            while (k-- > 0)
                tmp += "0";
            list.add(tmp);
        }
        Collections.sort(list);
        for (String ss : list){
            System.out.print(ss + " ");
        }

    }
}
