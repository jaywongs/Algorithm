package huawei;

import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/10
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = repsmall(str);
        str = repmid(str);
        str = repbig(str);
        int l = 0, h = str.length() - 1;
        char[] chars = str.toCharArray();
        while (l < h) {
            swap(chars, l++, h--);
        }
        System.out.println(new String(chars));
    }

    private static String repsmall(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                int j = i - 1;
                while (j > 0 && Character.isDigit(str.charAt(j))) {
                    j--;
                }
                int cnt;
                if (j == 0) {
                    cnt = Integer.parseInt(str.substring(0, i));
                }else {
                    cnt = Integer.parseInt(str.substring(j+1, i));
                }
                int end = str.indexOf(')');
                String tmp;
                if (j == 0) {
                    tmp = str.substring(0, end + 1);
                }else {
                    tmp = str.substring(j+1, end + 1);
                }
//                System.out.println(tmp);
                String s = str.substring(i + 1, end);
                String tmp2 = "";
                while (cnt-- > 0){
                    tmp2 += s;
                }
//                System.out.println(tmp2);
                str = str.replace(tmp, tmp2);
            }
        }
        return str;
    }

    private static String repmid(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '['){
                int j = i - 1;
                while (j > 0 && Character.isDigit(str.charAt(j))) {
                    j--;
                }
                int cnt;
                if (j == 0) {
                    cnt = Integer.parseInt(str.substring(0, i));
                }else {
                    cnt = Integer.parseInt(str.substring(j+1, i));
                }
                int end = str.indexOf(']');
                String tmp;
                if (j == 0) {
                    tmp = str.substring(0, end + 1);
                }else {
                    tmp = str.substring(j+1, end + 1);
                }
//                System.out.println(tmp);
                String s = str.substring(i + 1, end);
                String tmp2 = "";
                while (cnt-- > 0){
                    tmp2 += s;
                }
//                System.out.println(tmp2);
                str = str.replace(tmp, tmp2);
            }
        }
        return str;
    }

    private static String repbig(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{'){
                int j = i - 1;
                while (j > 0 && Character.isDigit(str.charAt(j))) {
                    j--;
                }
                int cnt;
                if (j == 0) {
                    cnt = Integer.parseInt(str.substring(0, i));
                }else {
                    cnt = Integer.parseInt(str.substring(j+1, i));
                }
                int end = str.indexOf('}');
                String tmp;
                if (j == 0) {
                    tmp = str.substring(0, end + 1);
                }else {
                    tmp = str.substring(j+1, end + 1);
                }
                String s = str.substring(i + 1, end);
                String tmp2 = "";
                while (cnt-- > 0){
                    tmp2 += s;
                }
                str = str.replace(tmp, tmp2);
            }
        }
        return str;
    }
    private static void swap(char[] array, int i, int j) {
        char t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
