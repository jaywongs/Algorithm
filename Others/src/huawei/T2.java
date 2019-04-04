package huawei;

import java.util.*;

/**
 * Created by jaywangs on 2019/4/3
 */
public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> valid = new ArrayList<>();
        List<String> invalid = new ArrayList<>();
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.equals(""))
                break;
            if (isvalid(str)){
                valid.add(str);
            }else {
                invalid.add(str);
            }
        }
        HashSet<String> set = new HashSet<>(valid);
        Iterator<String> it = set.iterator();
        StringBuilder sb = new StringBuilder();
        StringBuilder l3= new StringBuilder();
        StringBuilder l4= new StringBuilder();
        List<String> list3 = new ArrayList<>();
        while (it.hasNext()){
            String tmp = it.next();
           sb.append(tmp + " ");
           String s = LeftRotateString(tmp, 10);
           l3.append(s + " ");
           list3.add(s);
        }
        System.out.println(sb.toString().trim());

        StringBuilder strInvalid = new StringBuilder();
        for (String str : invalid){
            strInvalid.append(str + " ");
        }
        System.out.println(strInvalid.toString().trim());
        System.out.println(l3.toString().trim());

        Collections.sort(list3);
        for (String str : list3){
            l4.append(str + " ");
        }
        System.out.println(l4.toString().trim());

    }

    private static boolean isvalid (String str) {
        char [] chars = str.toCharArray();
        for (char ch : chars){
            if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    public static String LeftRotateString(String str, int n){
        if (str.length() < n)
            n = n % str.length();
        char [] arr = str.toCharArray();
        reverse(arr, 0, n - 1);
        reverse(arr, n, str.length() - 1);
        reverse(arr, 0, str.length() - 1);
        return new String(arr);
    }

    private static void reverse(char [] arr, int l, int r) {
        while(l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }

    private static void swap(char [] arr, int l, int r) {
        char tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }
}
