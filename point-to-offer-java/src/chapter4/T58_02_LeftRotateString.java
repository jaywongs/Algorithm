package chapter4;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T58_02_LeftRotateString {
    public static String LeftRotateString(String str, int n){
        if (str == null || n > str.length())
            return str;
        char[] arr = str.toCharArray();
        reverse(arr, 0, str.length()-1);
        reverse(arr, 0, n-1);
        reverse(arr, n, str.length()-1);
        return new String(arr);
    }

    private static void reverse(char[] arr, int i, int j){
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

}
