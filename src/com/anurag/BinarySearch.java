package com.anurag;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 8, 9, 11, 34, 56};
        int target = 11;
        System.out.println(binarySearch(arr, 8));

    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while(start <= end){
            // find the middle element
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid -1;
            }
            else if(arr[mid] < target){
                start = mid +1;
            }
            else if(arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
