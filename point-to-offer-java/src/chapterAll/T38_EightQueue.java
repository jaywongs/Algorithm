package chapterAll;

/**
 * Created by jaywangs on 2019/2/23
 * 八皇后问题
 */
public class T38_EightQueue {
    int MAX = 8;
    private int [] columnindex = new int[MAX];

    private void check(int n){
        if (n == MAX) {
            printQueue();
            return;
        }
        for (int i = 0; i < MAX; i ++){
            columnindex[n] = i;
            if (judge(n)){
                check(n+1);
            }
        }
    }

    private boolean judge(int n){
        for (int i = 0; i < n; i ++){
            if (columnindex[i] == columnindex[n] || n - i == Math.abs(columnindex[n] - columnindex[i])) {
                return false;
            }
        }
        return true;
    }

    private void printQueue() {
        for (int i = 0; i < columnindex.length; i++) {
            System.out.print(columnindex[i] + 1 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new T38_EightQueue().check(0);
    }
}
