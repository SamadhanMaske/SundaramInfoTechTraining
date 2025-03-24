package com.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Utility2{
	public int findDupicateElement(int arr[]) {
		int ans = -1;
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1])
				return arr[i+1];
		}
		return ans;
	}
	
	public List<Integer> findAllDuplicates(int arr[]) {
		Map<Integer, Integer> elementCount = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        // Count occurrences of each element
        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Add duplicate elements to the list
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        
        return duplicates;
	}
	
}
public class FindDuplicate {

	public static void main(String[] args) {
		
		Utility2 obj = new Utility2();
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {5,6,6,7,8,10};
		System.out.println("Single element in arr1:"+obj.findDupicateElement(arr1));
		System.out.println("Single element in arr2:"+obj.findDupicateElement(arr2));
		
		int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 6};
        List<Integer> duplicates = obj.findAllDuplicates(arr);

        System.out.print("All duplicate elements in arr: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
	}

}
