package ali;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by jaywangs on 2019/4/12
 */
public class pig {
    /**
     *
     * 小明是一个数学家，他喜欢用数字给事物命名编号，他给自己编号为1，同时在2019年小明开办了一个农场，准备开始养母猪，他专门给农场的
     * 母猪用以下数列2，3，4，5，7，9，12，16，21，28，37，49，65，86，114，151...进行命名。假设农场的母猪永远不会死，小母猪出生
     * 后3年后成熟，成熟后从第三年开始每年只会生一只小母猪。第一年农场，有一只刚刚出生的小母猪和一只成熟的母猪(本年不再生小猪，下一年
     * 开始生小猪)，并给他们编号为2和3。请问，第m只母猪编号为多少？其是哪一年出生的？小明还准备了1份礼物，专门颁给农场第1到m只的母猪
     * 颁奖，颁奖规则如下:选出第1到m只的母猪翻转编号(114编号翻转为411)为第k大的母猪进行颁奖，请问是第几只猪获奖？
     * 提示: f(n)=f(n-2)+f(n-3)
     * 2 3 5 8 13 21
     * 输入:
     * 输入两个参数半角逗号分隔
     * m,k
     * 输出:
     * 输出三个数字半角逗号分隔
     * 第m只母猪编号,哪一年出生,第几只小猪获奖
     * 输入范例:
     * 20,3
     * 输出范例:
     * 465,2024,15
     **/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(",");
        int m = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        int [] nums = new int[m];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 4;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(nums[0]);
        queue.add(nums[1]);
        queue.add(nums[2]);
        for (int i = 3; i < m; i++) {
            nums[i] = nums[i-2] + nums[i-3];
            queue.add(reverseInt(nums[i]));
            if (queue.size() > k)
                queue.poll();
        }
        int mark = nums[m - 1];
        int [] years = new int[m];
        years[0] = 2;
        years[1] = 3;
        for (int i = 2; i < m; i++) {
            years[i] = years[i - 1] + years[i - 2];
        }
        int year = 2019;
        for (int i = 0; i < m; i++) {
            if (years[i] > m) {
                year += i;
                break;
            }
        }
        //计算获奖母猪编号
        int j = reverseInt(queue.peek());
        int i = 0;
        for (; i < m; i++){
            if (nums[i] == j)
                break;
        }
        i += 1;
        System.out.println(mark + "," + year + "," + i);
    }

    private static int reverseInt(int num) {
        int res = 0;
        while (num != 0){
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res;
    }
}
