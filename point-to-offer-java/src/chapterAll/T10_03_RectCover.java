package chapterAll;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T10_03_RectCover {
    public int RectCover(int target) {
        if (target < 2) return target;
        int f1 = 1, f2 = 1;
        int RC = 0;
        for (int i = 2; i <= target; i++) {
            RC = f1 + f2;
            f1 = f2;
            f2 = RC;
        }
        return RC;
    }
}
