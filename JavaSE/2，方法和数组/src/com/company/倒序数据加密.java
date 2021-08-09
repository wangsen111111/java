package com.company;
public class 倒序数据加密 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        reverse(arr);
    }
    public static void reverse(int[] arr){
            for (int x = 0; x < arr.length/2; x++) {
                int temp = arr[x];
                arr[x] = arr[arr.length - 1-x];
                arr[arr.length-1-x] = temp;
            }
        }
    }

