package chapterAll;

/**
 * Created by jaywangs on 2019/2/24
 */
public class T44_digitAtIndex {
    public int digitAtIndex(int index) {
        if (index < 0) return -1;
        int digits = 1; //位数
        while (true) {
            long nums = countOfIntegers(digits);
            if (index < nums * digits) {
                break;
            }
            index -= nums * digits;
            ++digits;
        }
        return digitAtIndex(digits, index);
    }

    private long countOfIntegers(int digits) {
        return digits == 1 ? 0 : (int) (9 * Math.pow(10, digits - 1));
    }

    private int digitAtIndex(int digits, int index) { //获取位置
        int beginNum = getBeginNumber(digits);
        int val = beginNum + index / digits;
        int indexFromNum = index % digits;
        for (int i = 0; i < indexFromNum; i++)
            val /= 10;
        return val % 10;
    }

    private int getBeginNumber(int digits) {
        return digits == 1 ? 0 : (int) Math.pow(10, digits - 1);
    }
}