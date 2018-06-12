package com.yu.straightInsertionSort;

/**
 * Created by dayu on 2018/6/11
 * 直接插入排序
 */
public class StraightInsertionSort {
    /**
     * 直接插入排序
     * @param a 序排序数组
     * @param l 数组长度
     */
    public static void insertSort(int[] a, int l) {
        int i,j,k;
        for (i = 0; i < l ; i++) {
            for (j = i - 1; j > 0 ; j--) {
                if (a[j] < a[i])
                    break;//找到合适位置
            }
            if (j != i - 1) {
                //位置后面元素后移
                int temp = a[i];
                for (k = i - 1; k > j; k--) {
                    a[k + 1] = a[k];
                }
                a[k + 1] = temp;
            }
        }

    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {1,88,64,45,78,98,22,34};
        int l = a.length;
        System.out.println("------排序之前------");
        for (int tem : a) {
            System.out.print(tem + " ");
        }
        System.out.println();
        System.out.println("------排序之后------");
        insertSort(a,l);
        for (int tem : a) {
            System.out.print(tem + " ");
        }

    }
}
