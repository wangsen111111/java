package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Deque;
import java.util.LinkedList;

//[-2,1,-3,4,-1,2,1,-5,4]
public class 获取一个数组中所有的子序列 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        ziXuLie(array);
    }

    public static void ziXuLie(int[] arr){
        Deque<Integer> deque = new LinkedList<>();
        for(int i=1;i<=arr.length;i++){ //代表deque的size最大只能是i
            //遍历数组
            int end = 0;    //表示移动窗口的右边
            while (end<arr.length){

                if(deque.size()==i){
                    System.out.println(deque);
                    deque.removeFirst();
                    deque.addLast(arr[end]);
                    end++;
                }else {
                    deque.addLast(arr[end]);
                    end++;
                }
            }
            //因为上面循环中，移动窗口，等满了，才打印。最后满了的时候，添加了最后一个元素，但是end++就越界了，就不进入循环了，所以退出循环的时候，还要再输出一次
            System.out.println(deque);
            deque = new LinkedList<>();
        }

    }

    public static void ziXu(int[] array) {
        //{1, 3, 2, 5}
        //获取数据长度 那么对应的就是二进制字节位数1存在 0不存在  假设长度为4
        //一位子序列的情况有 1000  0100  0010 0001
        //二位子序列情况有 1100  1010  1001 0110 0101 0011
        //三位子序列情况 1110 1011 1101 0111
        //四位子序列情况 1111
        //空子序列 0000
        //4位每一位都有存在不存在两种可能，那么总共是2的4次幂中可能，遍历每一种可能去除存在的数组的元素即为该种情况的子集

        //二进制的可能情况end(即就是每一个有几个子序列)数量为1向左移动数组长度位数，为什么呢?因为总共是3位
        // 每一个存在不存在两种可能 所以就是2的4次方种情况
        int end = 1 << array.length;//<<左移，左边最高位丢弃，右边补齐，（把<<左边的数据*2的移动次幂）  << 1  相当于乘以2
        int mark = 0;//标记
        int num = 0;
        //打印出每一种情况的子序列
        for (mark = 0; mark < end; mark++) {
            boolean isNUll = true;
            //遍历都不存在就是空子集
            for (int i = 0; i < array.length; i++) {
                if ((1 << i & mark) != 0) {//!=0存在 =0不存在
                    isNUll = false;
                    System.out.print(array[i] + ",");
                }
            }
            if (isNUll) {
                System.out.print("null");
            }
            System.out.println();
            num++;
        }
        System.out.println(num);
    }

}
