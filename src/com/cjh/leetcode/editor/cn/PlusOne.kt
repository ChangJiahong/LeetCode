package com.cjh.leetcode.editor.cn;

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics 数组 数学 
// 👍 774 👎 0

/**
 * @author  ChangJiahong
 * @date 2021-10-19 17:59:11
 */

fun main() {
    val solution = PlusOne.Solution()
    println(solution.plusOne(intArrayOf(1, 2, 3)).joinToString())
    println(solution.plusOne(intArrayOf(4, 3, 2, 1)).joinToString())
    println(solution.plusOne(intArrayOf(0)).joinToString())
    println(solution.plusOne(intArrayOf(9, 9, 9)).joinToString())
    println(solution.plusOne(intArrayOf(8, 9, 9, 9)).joinToString())
}

public class PlusOne {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun plusOne(digits: IntArray): IntArray {
            // 进位标志位
            var f = 0
            digits[digits.size - 1] += 1
            for (i in digits.indices.reversed()) {
                var x = digits[i]
                if (f == 1) {
                    x += 1
                }
                f = if (x >= 10) 1 else 0
                digits[i] = x % 10
            }
            if (f == 1) {
                return intArrayOf(1).plus(digits)
            }
            return digits
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}