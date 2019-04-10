package huawei;

import java.util.*;

/**
 * Created by jaywangs on 2019/4/9
 */
public class timeVisitorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if (s.equals("-1,-1"))
                break;
            String [] tmp = s.split(",");
            int [] time = new int[] {Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1])};
            list.add(time);
        }
//        list.sort(Comparator.comparingInt(o1 -> o1[0]));
//        for (int [] t : list)
//            System.out.print(Arrays.toString(t) + " ");
        for (int i = 12; i < 20; i++){
            int cnt = list.size();
            for (int[] visitor : list){
                if (visitor[1] < i || visitor[0] >= i+1)
                    cnt--;
            }
            System.out.println("[" + i + "," + (i + 1) +"):" + cnt);
        }
    }
}
