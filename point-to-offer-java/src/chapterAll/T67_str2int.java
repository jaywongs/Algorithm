package chapter4;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T67_str2int {
    public static int str2int(String str) {
        int num = 0;
        boolean isNegative = str.charAt(0) == '-';
        for (int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))
                continue;
            if (c < '0' || c > '9')
                return 0;
            num = num * 10 + c - '0';
        }
        num = isNegative ? -num : num;
        return num;
    }

    public static void main(String[] args) {
        System.out.print(str2int("1123"));
    }
}
