package com.cjh.leetcode.editor.cn;

//实现 strStr() 函数。 
//
// 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如
//果不存在，则返回 -1 。 
//
// 
//
// 说明： 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。 
//
// 
//
// 示例 1： 
//
// 
//输入：haystack = "hello", needle = "ll"
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：haystack = "aaaaa", needle = "bba"
//输出：-1
// 
//
// 示例 3： 
//
// 
//输入：haystack = "", needle = ""
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 104 
// haystack 和 needle 仅由小写英文字符组成 
// 
// Related Topics 双指针 字符串 字符串匹配 
// 👍 1076 👎 0

/**
 * @author ChangJiahong
 * @date 2021-10-19 10:30:25
 */
public class ImplementStrstr {
    public static void main(String[] args) {
        Solution solution = new ImplementStrstr().new Solution();
        System.out.println(solution.strStr("aaaaa", "bba"));
        System.out.println(solution.strStr("hello", "ll"));
        System.out.println(solution.strStr("", "z"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length()==0){
                return 0;
            }
            int[] next = next(needle);
            int j = -1;
            for (int i = 0; i < haystack.length(); i++) {
                while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                    j = next[j];
                }
                if (haystack.charAt(i) == needle.charAt(j + 1)) {
                    j++;
                }
                if (j == needle.length() - 1) {
                    return (i - needle.length() + 1);
                }
            }
            return -1;
        }

        /**
         * 构建next 前缀表
         *
         * @param needle
         * @return
         */
        public int[] next(String needle) {
            int[] next = new int[needle.length()];
            int j = -1;
            next[0] = j;
            for (int i = 1; i < next.length; i++) {
                while (j >= 0 && needle.charAt(i) != needle.charAt(j + 1)) {
                    // 回溯
                    j = next[j];
                }
                if (needle.charAt(i) == needle.charAt(j + 1)) {
                    j++;
                }
                next[i] = j;
            }
            return next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}