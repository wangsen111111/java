package com.company;
/*
输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

要求：子数组可以不连续（）
 */
/*
对数组的操作类
 */

        public class Main {
            public static void main(String[] args){
                int[] arr={-2,1,-3,4,-1,2,1,-5,4};
                fangFa.printArray(arr);
                System.out.println(fangFa.getMax(arr));
                System.out.println("-------------------------");
                fangFa.ziXu(arr);
            }
        }
/*
这是获取数组最大值的方法
 */
        class fangFa {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    /*
    遍历数组
     */
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "}");
            } else {
                System.out.print(arr[x] + ",");
            }
        }
    }

    /*
            方法：maxArr
              子序列只有一个数 【-2】  子序列只有1=1个  子序列最大值为arr[0]
               子序列有两个数  【-2,1】 子序列有3=2+个    子序列最大值为arr【0】arr[1] {arr[0] arr[1]]
               子序列有三个数【-2,1，-3】子序列有6=3+2+1个    子序列最大值为arr【0】 arr[1] arr[2] {arr[0]1} {arr[1]2} {arr【0】 arr[1] arr[2]}
               子序列有4个数【-2,1，-3,4】子序列有10=4+3+2+1个   子序列的最大值为
               子序列有n个数              子序列有n*(n+1)/2=n+(n-1)+(n-1-1)+...+1个
               由此分析：n数组的子序列有n*(n+1)/2 个，
               1，我们可以把每个子序列的最大值先求出来，
               2，放在一个数组里面，
               3，然后继续求出这个数组的最大值
         */
    public static void maxArr(int[] arr) {
        //  1，我们可以把每个子序列的最大值先求出来，
                /*
                1,先得得到每个子序列
                2，然后遍历每一个子序列，求出子序列的最大值
                 */
    }

    //1,先得得到每个子序列
    public static void ziXu(int[] arr) {
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
        int end = 1 << arr.length;//<<左移，左边最高位丢弃，右边补齐，（把<<左边的数据*2的移动次幂）  << 1  相当于乘以2
        int x = 0;//标记x=mark
        //打印出每一种情况的子序列
        int num=0;
        for (x = 0; x < end; x++) {
            boolean isNUll = true;
            //遍历都不存在就是空子集
            for (int i = 0; i < arr.length; i++) {
                if ((1 << i & x) != 0) {//!=0存在 =0不存在
                    isNUll = false;
                    System.out.print(arr[i] + ",");
                }
            }
            if (isNUll) {
                System.out.print("null");
            }
            System.out.println();
            num++;
            /*
               2，然后遍历每一个子序列，求出子序列的最大值
                */

            System.out.println("这一子序列中的最大值为：");
            System.out.println(getMax(new int[]{arr[num]}));

        }
            /*
            2，然后遍历每一个子序列，求出子序列的最大值
             */
        //System.out.println(getMax(arr));

    }
}
