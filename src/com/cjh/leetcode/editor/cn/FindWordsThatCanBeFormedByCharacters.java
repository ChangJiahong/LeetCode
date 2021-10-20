package com.cjh.leetcode.editor.cn;

//给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。 
//
// 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。 
//
// 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。 
//
// 返回词汇表 words 中你掌握的所有单词的 长度之和。 
//
// 
//
// 示例 1： 
//
// 输入：words = ["cat","bt","hat","tree"], chars = "atach"
//输出：6
//解释： 
//可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
// 
//
// 示例 2： 
//
// 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//输出：10
//解释：
//可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// 所有字符串中都仅包含小写英文字母 
// 
// Related Topics 数组 哈希表 字符串 
// 👍 136 👎 0

import java.util.Arrays;

/**
 * @author  ChangJiahong
 * @date 2021-07-06 15:32:13
 */
public class FindWordsThatCanBeFormedByCharacters{
    public static void main(String[] args) {
        Solution solution = new FindWordsThatCanBeFormedByCharacters().new Solution();
        System.out.println(solution.countCharacters(new String[]{"cat","bt","hat","tree"},"atach"));
        System.out.println(solution.countCharacters(new String[]{"hello","world","leetcode"},"welldonehoneyr"));


   }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countCharacters(String[] words, String chars) {
//        char[][] chars1 = new char[words.length][];
        char[] chars2 = chars.toCharArray();
        Arrays.sort(chars2);
        String str = String.copyValueOf(chars2);
        System.out.println(str);
        int temp = 0;
        for (int i = 0; i < words.length; i++) {
            char[] chars3 = words[i].toCharArray();
            Arrays.sort(chars3);
            String str1 = String.copyValueOf(chars3);
            System.out.println(str1);
            if (str.contains(str1)){
                temp+=str1.length();
                System.out.println(str1);
            }
        }
        return temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}