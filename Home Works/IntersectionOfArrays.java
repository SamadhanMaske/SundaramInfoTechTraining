package com.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Utility3{
	List<Integer> findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();
        // Add elements of the first array to the set
        for (int num : arr1) {
            set1.add(num);
        }
        // Check elements of the second array in the set
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }
}
public class IntersectionOfArrays {

    public static void main(String[] args) {
    	Utility3 obj = new Utility3();
    	int[] arr1 = {1, 2, 2, 3, 4, 5, 5};
        int[] arr2 = {2, 3, 5, 5, 6};

        List<Integer> intersection = obj.findIntersection(arr1, arr2);

        System.out.print("CIntersection of arrays: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }
}
