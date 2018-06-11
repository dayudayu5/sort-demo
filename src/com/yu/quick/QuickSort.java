package com.yu.quick;

/**
 * Created by dayu on 2018/6/11
 */
public class QuickSort {
    /**
     * 快速排序
     * @param a---需要排序数组
     * @param l---左边界
     * @param r---右边界
     * o(nlogn)
     */
    public static void quickSort(int[] a, int l, int r) {
        if (l < r) {
            int i = l;
            int j = r;
            int x = a[i];
            while (i < j) {
                while(i < j && a[j] > x)
                    j--;//从右找第一个比x小的数字
                if (i < j)
                    a[i++] = a[j];
                while (i < j && a[i] < x)
                    i++;//从左找第一个比x大的数字
                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = x;
            quickSort(a, l, i-1);
            quickSort(a, i+1, r);
        }
    }
    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] a = {30,88,64,45,78,98,22,34};
        int i = a.length;
        System.out.println("------排序之前------");
        for (int tem : a) {
            System.out.print(tem + " ");
        }
        System.out.println();
        System.out.println("------排序之后------");
        int l = 0;
        quickSort(a, 0, i-1);
        for (int tem : a) {
            System.out.print(tem + " ");
        }

    }
}
