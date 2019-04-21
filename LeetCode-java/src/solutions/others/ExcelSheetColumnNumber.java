/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 **/
package solutions.others;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {
        int i = s.length() - 1;
        int num = 0;
        for (char c : s.toCharArray()){
            num += (c - 64) * Math.pow(26, i--);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("B"));
    }
}
