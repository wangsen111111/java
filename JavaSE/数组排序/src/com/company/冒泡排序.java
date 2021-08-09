package com.company;
/*
冒泡排序：相邻两两元素比较，大的往后放，第一次完毕，最大值出现在拉最大索引处，同理，继续皆可得到一个排好序的数组
         规律：两两比较，大的往后放，第一次比较完毕后，下一次比较的时候就会减少一个元素的比较，总共需要比较数组长度-1次
 */

public class 冒泡排序 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1, 3, 2, 4, 5};
        //对数组进行冒泡排序
        bubbleSort(arr);
        //遍历数组，并将其输出
        printArray(arr);

    }

    //遍历数组功能
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
    }

    //冒泡排序功能
    public static void bubbleSort(int[] arr) {
        boolean flag=true;
            for (int x = 0; x < arr.length - 1; x++) {

                    for (int y = 0; y < arr.length - 1 - x; y++) {
                        if (arr[y] > arr[y + 1]) {
                            int temp = arr[y];
                            arr[y] = arr[y + 1];
                            arr[y + 1] = temp;
                            // 有元素交换，所以不是有序，标记变为false
                            flag = false;
                        }
                    }
                // 说明上面内层for循环中，没有交换任何元素，直接跳出外层循环
                    if(flag){break;}
                }
    }
}


