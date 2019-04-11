package chapter2;

/**
 * Created by jaywangs on 2019/3/10
 */
public class StringNumMultiply {

    public static String bigMul(String str1, String str2) {
        if (str1 == null || str2 == null)
            return null;
        int size1 = str1.length(), size2 = str2.length();
        int []res = new int [size1 + size2];
        for (int i = size1 - 1; i >= 0; i --) {
            for (int j = size2 - 1; j >= 0; j--){
                int mul = (str1.charAt(i) - '0') * (str2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;

            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : res){
            if (!(sb.length() == 0 && i == 0))
                sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(bigMul("123", "123456567354647"));
    }
}
