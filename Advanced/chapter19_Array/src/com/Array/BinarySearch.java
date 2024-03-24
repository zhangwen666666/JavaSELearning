package com.Array;

public class BinarySearch {
    /**
     * 从数组(排好序的)中检索某个元素的下标
     * @param arr 数组
     * @param elem 被查找的元素值
     * @return 返回elem在数组arr中的下标，如果不存在，返回-1
     */
    public static int binarySearch(int[] arr, int elem) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == elem)
                return mid;
            else if (arr[mid] > elem)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}


class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 45, 68, 46, 34, 21, 35, 18, 10};
        BubbleSort.sort(arr);
        BubbleSort.printArray(arr);
        System.out.println(BinarySearch.binarySearch(arr, 10));
    }
}