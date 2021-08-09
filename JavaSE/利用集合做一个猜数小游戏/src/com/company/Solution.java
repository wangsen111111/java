package com.company;

import java.util.HashMap;
import java.util.Map;
//https://leetcode-cn.com/problems/minimum-window-substring/solution/yi-bu-bu-xing-cheng-hua-dong-chuang-kou-si-lu-shen/
class Solution {
    public String minWindow(String s, String target) {
        //滑动窗口
        //1,
        int missType = 0;//当前缺失得字符种类数
        /**
         * 输入字符串为 'ABC'，则 map 初始为 { A: 1, B: 1, C: 1 }，
         * 这些值是动态的，比如窗口新纳入一个 A，则 map["A"] 减 1。
         * map["A"] 为 0 代表不缺 A 了，A 字符找齐了。
         */
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            if (!count.containsKey(c)) {
                missType++; //添加一种 缺失字符种类
            }
            /**
             * Map.getOrDefault(Object key, V defaultValue)方法的作用是：
             *   当Map集合中有这个key时，就使用这个key值；
             *   如果没有就使用默认值defaultValue。
             */
            count.put(c, count.getOrDefault(c, 0) + 1); //更新此目标字符需要的数量
        }

        int left = 0;
        int right = 0;
        int minLen = s.length() + 1; //最小窗口长度
        int minStart = 0; //最小窗口的起点
        for (; right < s.length(); right++) {
            //2,
            char c = s.charAt(right);
            //右指针在扩张过程遇到了目标字符
            if (count.containsKey(c)) {
                count.put(c, count.get(c) - 1); //更新该目标字符仍需要的次数
                if (count.get(c) == 0) {
                    missType--; //完成收集其中一种字符数量了
                }
            }

            //3,
            //扩张过程发现已经刚好达到目标字符串的要求,就要收缩优化，左指针向右移动直到不满足要求,当窗口不再包含所有目标字符，即有目标字符丢失，就不再收缩
            while (missType == 0 && left <= right) {
                char leftChar = s.charAt(left);
                if (minLen > right - left + 1) {
                    minLen = right - left + 1; //更新结果的最小窗口长度
                    minStart = left; //更新最小窗口的字符串开始位置
                }
                if (count.containsKey(leftChar)) {
                    count.put(leftChar, count.get(leftChar) + 1);
                    if (count.get(leftChar) > 0) {
                        missType++;//当出现了缺失的目标字符，缺失种类加一
                    }
                }
                left++;//左指针向右移动，继续收缩
            }
        }
        return minLen > s.length() ? "" : s.substring(minStart, minStart + minLen);
    }
}