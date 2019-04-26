package solutions.dynamicProgramming;

import java.util.List;

/**
 * Created by jaywangs on 2019/4/26
 */
public class T120_Triangle {
    /**
     * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
     *
     * For example, given the following triangle
     *
     * [
     *      [2],
     *     [3,4],
     *    [6,5,7],
     *   [4,1,8,3]
     * ]
     * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
     *
     * Note:
     *
     * Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
     **/

    // 状态转移方程 ：
    // minpath[i] = min(minpath[i], minpath[i+1]) + triangle[k][i] (第k行的每一个i)
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int [] minpath = new int[triangle.get(n-1).size()];
        for (int i = 0; i < minpath.length; i++)
            minpath[i] = triangle.get(n-1).get(i);
        for (int k = n - 2; k >= 0; k--) {
            for (int i = 0; i <= k; i++) {
                minpath[i] = Math.min(minpath[i], minpath[i+1]) + triangle.get(k).get(i);
            }
        }
        return minpath[0];
    }

}
