### 解题思路

元素计数的操作，使用哈希表做肯定不会错，但效率不一定高。

在有限元素并且元素连续出现的情况下，使用数组计数，效率是最高的。比如小写字母就是一个长度是26的int数组。

因为chars里面的字符，在每一个单词上都要使用，我们用一个copy数组循环使用。

代码的实现过程很容易，如下：

### 代码

```java
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a'] += 1;
        }
        int[] copy = new int[26];
        int ans = 0;

        out: // 外循环的标识符
        for (String word : words) {
            System.arraycopy(arr, 0, copy, 0, arr.length);
            for (char c : word.toCharArray()) {
                copy[c - 'a'] -= 1;
                if (copy[c - 'a'] < 0) {
                    continue out; // 直接跳至外循环的下一次循环
                }
            }
            ans += word.length();
        }
        return ans;
    }
}
```
![image.png](https://pic.leetcode-cn.com/1619936253-iWuRIa-image.png)
