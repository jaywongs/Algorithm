package chapterAll;

/**
 * Created by jaywangs on 2019/2/25
 */
public class T46_numDecodings {
    private int numDecodings(String s) {
        if (s == null || s.length() < 2)
            return 1;
        char[] chars = s.toCharArray();
        int n = chars.length;
        int [] res = new int[n];
        res[0] = 1;
        res[1] = isInRange(chars[0], chars[1]) ? 2 : 1;
        for (int i = 2; i <= n; i++) {
            res[i] = res[i - 1] + (isInRange(chars[i - 1], chars[i]) ? res[i - 2] : 0);
        }
        return res[n - 1];
    }

    private boolean isInRange(Character c1, Character c2){
        int s = (c1 - '0') * 10 + c2 - '0';
        return s >= 10 && s <= 25;
    }
}
