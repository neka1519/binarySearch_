package com.neka;

public class Main {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
    int left = 0;
    int right = arr.length-1;
    int mid;
    int target = 6;

    while( left <= right) {

        mid = left + (right - left) / 2;
        //if mid is equal to target
        if (arr[mid] == target) {
            System.out.println("Target found at the index" + mid);
            break;
        }
        //if target is greater than mid
        else if (target > arr[mid])
            left = mid + 1;

        else if (target < arr[mid])
            right = mid - 1;
    }
    System.out.println("Number not present");


    }
}
