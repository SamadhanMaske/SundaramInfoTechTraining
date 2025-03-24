package com.homework;

import java.util.Arrays;

class Utility4{
	public int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        
        for (int i = 0; i < k; i++) {
        	int last = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }
}
public class RotateArrayByK {
    
    public static void main(String[] args) {
    	Utility4 obj = new Utility4();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.print("Array elements before rotations: ");
        for(int i: arr) {
        	System.out.print(i+" ");
        }
        System.out.println();
        int newArr[] = obj.rotateRight(arr, k);
        System.out.print("Array elements after "+k+ " rotations: ");
        for(int i: newArr) {
        	System.out.print(i+" ");
        }
        System.out.println();
        
    }
}

