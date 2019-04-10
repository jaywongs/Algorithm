package huawei;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by jaywangs on 2019/4/9
 */
public class removeDuplicatedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals("")) break;
            Set<Character> set = new HashSet<>();
            for (char c : str.toCharArray()){
                set.add(c);
            }
            StringBuilder sb = new StringBuilder();
            for (char c :set)
                sb.append(c);
            System.out.println(sb.toString());
        }
    }
}
