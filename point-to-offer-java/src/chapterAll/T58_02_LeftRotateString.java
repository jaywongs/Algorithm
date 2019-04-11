package chapter4;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T58_02_LeftRotateString {
    public static String LeftRotateString(String str, int n){
         if (str.length() < n)
                return str;
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

    public static void main(String[] args) {
        System.out.println(LeftRotateString("", -1));
    }

}
