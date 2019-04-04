package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/3
 */
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        List<String> list = new ArrayList<>();
        String h = sc.nextLine();
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals(""))
                break;
            list.add(str + ",");
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(list);
        int j = 0;
        int i = 0;
//        int size = list.size();
        while (i < list.size() && list.size() != 0){

            if (j + d * 2 < list.get(i).length()){
                sb.append(list.get(i).substring(j, j + d * 2));
            }else {
                sb.append(list.get(i).substring(j));
                list.remove(i--);
            }
            i++;
            if (i >= list.size()) {
                i = 0;
                j += d * 2;
            }

        }
        String res = sb.toString();
        System.out.println(res.substring(0, res.length() - 1));
    }


}
