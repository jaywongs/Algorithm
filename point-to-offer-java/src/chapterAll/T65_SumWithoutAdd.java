package chapterAll;

/**
 * Created by jaywangs on 2019/3/2
 */
public class T65_SumWithoutAdd {
    public int Add(int a, int b) {
        return b == 0 ? a : Add(a ^ b, (a & b) << 1);
    }
}
