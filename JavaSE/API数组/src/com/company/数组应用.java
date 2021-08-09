package com.company;

public class 数组应用 {

    public static void main(String[] args) {
        /*
        二维数组： 开辟一个二维数组：int[][] arr=new int[3][];动态的为每一个一维数组分配空间arr[0]=new int[3];
                   字符串数组：String[] strArray={"周一","周二","周三"...}
                   arr.length二维数组长度（几个一维数组）      arr[x].length一维数组长度
         */
        // int[][] arr = new int[3][];
        //arr[0] = new int[]{1, 2, 3};
        //arr[1] = new int[]{4, 5, 6};
        //arr[2] = new int[]{7, 8, 9};

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /*

        2、拆开二维数组，获取每一个一维数组

        for (int i = 0; i < arr.length; i++) {

            //arr[i] 表示第i+1个一维数组

            3、拆开一维数组

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println(arr[i][j]);

            }
            }
         */

        printArray(arr);
    }
        /*
    遍历数组
     */

        public static void printArray(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print("{");
                for (int x = 0; x < arr.length; x++) {
                    if (x == arr.length - 1) {
                        System.out.println(arr[x] + "}");
                    } else {
                        System.out.print(arr[x] + ",");
                    }
                }
            }
        }
}
