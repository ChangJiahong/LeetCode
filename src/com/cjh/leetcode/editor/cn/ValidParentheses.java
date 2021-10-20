package com.cjh.leetcode.editor.cn;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2520 👎 0

import java.util.Stack;

/**
 * @author ChangJiahong
 * @date 2021-07-29 16:29:34
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("{[]}"));
        System.out.println(solution.isValid("([)]"));
        System.out.println(solution.isValid("(]"));
        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid(")(}{"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (stack.empty()) {
                    stack.push(c);
                } else {
                    char t = stack.peek();
                    if (getV(c) + getV(t) == 0 && getV(c)>0) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            return stack.empty();
        }

        public int getV(char c) {
            switch (c) {
                case '(':
                    return -1;
                case ')':
                    return 1;
                case '{':
                    return -2;
                case '}':
                    return 2;
                case '[':
                    return -3;
                case ']':
                    return 3;
            }
            return 0;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}