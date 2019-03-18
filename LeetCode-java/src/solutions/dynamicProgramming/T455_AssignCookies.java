package solutions.dynamicProgramming;
import java.util.Arrays;
/**
 * created by jaywang on 2019/3/11.
 */
public class T455_AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        if (s == null || s.length == 0 || g == null || g.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gl = g.length, sl = s.length;
        int i = 0, j = 0;
        int cnt = 0;
        while (i < gl && j < sl) {
            if (g[i] <= s[j]) {
                cnt ++;
                i ++;
                j ++;
            }else{
                j ++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
