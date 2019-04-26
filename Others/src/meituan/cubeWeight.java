package meituan;

import java.util.*;

/**
 * created by jaywang on 2019/4/23.
 */
/**
 * 题目描述：
 * 小团在一次星际旅行中，耗尽了飞船的能量，迷失在了空间魔方中，空间魔方中有N*N*N个能量粒子。美团云AI迅速帮小团分析出了空间魔方的能量分布图。
 *
 * 已知小团的飞船被困在能量值最高的点，能量值最高点有且只有一个。飞船每到达一个能量粒子就会吸收对应粒子的能量，该粒子会坍缩成小黑洞，飞船
 * 不可到达。小团驾驶的飞船只能从高能粒子驶向低能粒子，且每次只能从6个方向中选择一个前进。（±x,±y,±z）。
 *
 * 请帮助帮小团吸收最高的能量值。
 *
 * 输入
 * N（0≤N≤8）
 *
 * N*N*N行空间能量数据，格式为：X Y Z P，XYZ表示点坐标，P表示空间能量分布（0≤P）
 *
 * 输出
 * 可吸收到的最高的能量值
 *
 * 输入
 * 2
 * 0 0 0 7
 * 0 0 1 2
 * 0 1 0 4
 * 0 1 1 3
 * 1 0 0 6
 * 1 0 1 1
 * 1 1 0 5
 * 1 1 1 0
 * 输出
 * 28
 *
 */
public class cubeWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<int []> list = new ArrayList<>();
        for (int i = 0; i < Math.pow(N, 3); i++){
            int [] ints = new int[4];
            for (int j = 0; j < 4; j++){
                ints[j] = sc.nextInt();
            }
            list.add(ints);
        }

        Collections.sort(list, Comparator.comparingInt(o -> o[3]));
        for (int [] ints : list){
            System.out.println(Arrays.toString(ints));
        }

    }
}
