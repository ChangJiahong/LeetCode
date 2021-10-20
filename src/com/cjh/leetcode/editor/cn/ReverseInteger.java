package com.cjh.leetcode.editor.cn;

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2901 👎 0

/**
 * @author ChangJiahong
 * @date 2021-07-06 11:07:48
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();

        System.out.println(solution.reverse(123));
        System.out.println(solution.reverse(-123));
        System.out.println(solution.reverse(120));
        System.out.println(solution.reverse(0));
        System.out.println(solution.reverse(1234567899));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            int symbol = x < 0 ? -1 : 1;
            int absX = Math.abs(x);
            int temp = 0;
            while (absX != 0) {
                int tmp = temp;
                int t = absX % 10;
                absX = absX / 10;
                temp = temp * 10 + t;
                // 发生溢出
                if (temp / 10 != tmp) return 0;
            }
            temp = symbol * temp;
            return temp;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}