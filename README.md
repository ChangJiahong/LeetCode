# LeetCode 刷题库

## 准备阶段

- leetcode editor 插件

## 配置

### **TempFilePath** 

```{{IdeaProjects}}\LeetCode\src\com\cjh```

### **CodeFileName** 
```$!velocityTool.camelCaseName(${question.titleSlug})```

### **CodeTemplate** 

#### Java 配置

```access transformers
package com.cjh.leetcode.editor.cn;

${question.content}
 /**
 * @author  ChangJiahong
 * @date $!velocityTool.date()
 */
public class $!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
        Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
   }
    ${question.code}
}
```

#### Kotlin 配置

```access transformers
package com.cjh.leetcode.editor.cn;

${question.content}
 /**
 * @author  ChangJiahong
 * @date $!velocityTool.date()
 */

fun main(){
    val solution = $!velocityTool.camelCaseName(${question.titleSlug}) .Solution()
}
public class $!velocityTool.camelCaseName(${question.titleSlug}){
    ${question.code}
}
```