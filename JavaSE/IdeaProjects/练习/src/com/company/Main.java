package com.company;
/*
1.算法思想
二分插入排序也是插入排序算法的一种，其基本思想是：引入二分查找的思想，在直接插入排序的基础上减少比较次数，从而更快的找到插入位置。
2.算法图解
最后一个待排序元素通过二分插入算法找到自己的位置并插入其中
初始状态左边界为0，右边界为6，mid=3，中间值为49，最后一个元素不小于49则左边界扩大为mid+1=4，mid=5，此时中间值为76，
最后一个元素小于76则右边界缩小为mid-1=4，mid=4，此时中间值为65，最后一个元素小于65则右边界缩小为mid-1=3，找到了插入位置，
即左边界位置为插入位置，其后的元素全部后移。

 */
public class BinarySort {

    public static void sort(int a[])
    {
        int temp,left,right,mid;
        for(int i=1;i<a.length;i++)
        {
            temp = a[i];
            left = 0;
            right = i-1;
            while(left<=right)
            {
                mid = (left+right)/2;
                if(temp<a[mid])
                {
                    right = mid-1;
                }
                else
                {
                    left = mid+1;
                }
            }
            for(int j=i-1;j>=left;j--)
            {
                a[j+1] = a[j];
            }
            if(i!=left)
            {
                a[left] = temp;
            }
        }
    }
    public static void main(String agrs[])
    {
        int []a = {49,38,65,97,76,13,27,49};
        BinarySort.sort(a);
        for(int element :a)
        {
            System.out.print(element+" ");
        }
    }
}