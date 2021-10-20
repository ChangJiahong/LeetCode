package com.cjh.leetcode.editor.cn;


//给你两个二进制字符串，返回它们的和（用二进制表示）。 
//
// 输入为 非空 字符串且只包含数字 1 和 0。 
//
// 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
//
// 
//
// 提示： 
//
// 
// 每个字符串仅由字符 '0' 或 '1' 组成。 
// 1 <= a.length, b.length <= 10^4 
// 字符串如果不是 "0" ，就都不含前导零。 
// 
// Related Topics 位运算 数学 字符串 模拟 
// 👍 687 👎 0

/**
 * @author  ChangJiahong
 * @date 2021-10-19 19:17:09
 */

fun main() {
    val solution = AddBinary.Solution()
    println(solution.addBinary("1010", "1011"))
    println(solution.addBinary("1010", "10110"))
    println(solution.addBinary("11", "1"))
}

public class AddBinary {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun addBinary(a: String, b: String): String {
            // 被加数
            val sb1 = StringBuffer(if (a.length > b.length) a else b)
            // 加数
            val sb2 = StringBuffer(if (a.length <= b.length) a else b)

            for (i in 0 until sb1.length - sb2.length) {
                sb2.insert(0, "0")
            }
//            println(sb1)
//            println(sb2)
            val result = StringBuffer()

            var f = 0
            for (i in sb1.indices.reversed()) {
                val x = sb1[i]
                val y = sb2[i]
                val (t, ff) = add(x, y, f)
//                println("$x+$y+$f=$t--$ff")
                f = ff
                result.append(t)
            }
            if (f == 1) {
                result.append("1")
            }
            return result.reverse().toString()
        }

        fun add(x: Char, y: Char, f: Int): Pair<Int, Int> {
            val t: Int = x.toInt() +y.toInt()  + f - 48*2
            return when (t) {
                3 -> Pair(1, 1)
                2 -> Pair(0, 1)
                1 -> Pair(1, 0)
                else -> Pair(0, 0)
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}