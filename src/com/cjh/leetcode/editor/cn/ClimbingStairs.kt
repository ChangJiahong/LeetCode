package com.cjh.leetcode.editor.cn;

import com.sun.xml.internal.fastinfoset.util.StringArray

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 记忆化搜索 数学 动态规划 
// 👍 1944 👎 0

/**
 * @author  ChangJiahong
 * @date 2021-10-20 11:49:58
 */

fun main() {
    val solution = ClimbingStairs.Solution()
//    for (i in 1..5) {
//        println("$i--" + solution.climbStairs(i))
//    }
    println("$35--" + solution.climbStairs(35))

}

public class ClimbingStairs {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        fun climbStairs(n: Int): Int {
            if (n == 1) {
                return 1
            }
            val dp = IntArray(n)
            dp[0] = 1
            dp[1] = 2
            val dps = ArrayList<String>()
            dps.add("1")
            dps.add("1,1;2")
            for (i in 2 until n) {
                dp[i] = dp[i - 1] + dp[i - 2]
//                dps.add(dps[i - 1].split(";").joinToString(";") { it + ",1" }
//                +";"+dps[i - 2].split(";").joinToString(";") { it + ",2" })
            }

//            dps[n-1].split(";").forEachIndexed{index,it->
//                println("${index+1}. $it")
//            }
            return dp[n - 1]
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}