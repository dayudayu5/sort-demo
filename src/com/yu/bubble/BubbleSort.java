package com.yu.bubble;

/**
 * Created by dayu on 2018/6/11
 * 冒泡排序
 */
public class BubbleSort {
    /**
     *参数说明:
     * a--需要排序数组
     * n--数组长度
     *
     * o(n2)
     */
    public static void bubbleSort(int[] a, int n) {
        //已排序好标识
        int flag = 0;
        for (int i = n-1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;//交换后变为1
                }
            }
            if(flag == 0)
                break;
        }
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1,88,64,45,78,98,22,34};
        int i = a.length;
        System.out.println("------排序之前------");
        for (int tem : a) {
            System.out.print(tem + " ");
        }
        System.out.println();
        System.out.println("------排序之后------");
        bubbleSort(a,i);
        for (int tem : a) {
            System.out.print(tem + " ");
        }

    }
}
