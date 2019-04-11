package chapter4;

/**
 * Created by jaywangs on 2019/3/8
 */
public class T10_02_JumpFloor {
    public int JumpFloor(int target) {
        if (target <= 1) return target;
        int f1 = 1, f2= 1;
        int floor = 0;
        for (int i = 2; i <= target; i ++) {
            floor = f1 + f2;
            f1 = f2;
            f2 = floor;
        }
        return floor;
    }
}
