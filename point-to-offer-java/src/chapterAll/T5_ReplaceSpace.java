package chapter4;


/**
 * Created by jaywangs on 2019/3/8
 */
public class T5_ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str == null) return null;
        char [] chars = str.toString().toCharArray();
        int n = chars.length;
        int blank = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == ' ')
                blank += 1;
        }
        char [] strs = new char [n + blank * 2];
        int i = n - 1;
        while (i >= 0) {
            if (chars[i] != ' '){
                strs[i + blank * 2] = chars[i];
            }else {
                strs[i + blank * 2] = '0';
                strs[i + blank * 2 - 1] = '2';
                strs[i + blank * 2- 2] = '%';
                blank --;
            }
            i --;
        }
        return new String(strs);
    }

}
