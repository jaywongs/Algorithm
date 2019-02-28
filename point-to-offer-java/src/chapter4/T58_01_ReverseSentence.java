package chapter4;

/**
 * Created by jaywangs on 2019/2/28
 */
public class T58_01_ReverseSentence {
    public static String ReverseSentence(String str) {
        int n = str.length();
        if (str == null || n == 0 || str.trim().equals(""))
            return str;
        String[] arr = str.split(" ");
        reverse(arr, 0, arr.length - 1);
        return String.join(" ", arr);
    }

    private static void reverse(String[] arr, int i, int j){
        while (i < j) {
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        System.out.println(ReverseSentence("i am a students."));
    }
}
