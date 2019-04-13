package chapterAll;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T58_01_ReverseSentence {
    public static String ReverseSentence(String str) {
        if (str.length() < 0)
            return str;
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length - 1);
        int start = 0, end = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ')
                continue;
            end = i;
            reverse(chars, start, end - 1);
            start = end + 1;
        }
        reverse(chars, start, chars.length - 1);
        return new String(chars);
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
        System.out.println(ReverseSentence("student. a am I"));
    }
}
