package com.cjh.leetcode.editor.cn;

//给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。 
//
// 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。 
//
// 
//
// 示例 1： 
//
// 输入：date = "2019-01-09"
//输出：9
// 
//
// 示例 2： 
//
// 输入：date = "2019-02-10"
//输出：41
// 
//
// 示例 3： 
//
// 输入：date = "2003-03-01"
//输出：60
// 
//
// 示例 4： 
//
// 输入：date = "2004-03-01"
//输出：61 
//
// 
//
// 提示： 
//
// 
// date.length == 10 
// date[4] == date[7] == '-'，其他的 date[i] 都是数字。 
// date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。 
// 
// Related Topics 数学 字符串 
// 👍 36 👎 0

/**
 * @author ChangJiahong
 * @date 2021-07-06 15:09:48
 */
public class DayOfTheYear {
    public static void main(String[] args) {
        Solution solution = new DayOfTheYear().new Solution();
        System.out.println(solution.dayOfYear("2012-01-02"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int dayOfYear(String date) {
            String[] dates = date.split("-");
            int yy = Integer.parseInt(dates[0]);
            int mm = Integer.parseInt(dates[1]);
            int dd = Integer.parseInt(dates[2]);
            //                    1   2  3  4  5  6  7  8  9  10 11 12
            int[] mmd = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int sumDay = 0;
            for (int i = 0; i < mm - 1; i++) {
                sumDay += mmd[i];
            }
            sumDay += dd;
            if ((yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) && mm > 2) {
                // 闰年
                sumDay += 1;
            }
            return sumDay;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}