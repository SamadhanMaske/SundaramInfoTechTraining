package com.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Utility5{
	public List<int[]> findPairs(int[] arr, int S) {
        HashSet<Integer> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();

        for (int num : arr) {
            int complement = S - num;
            if (seen.contains(complement)) {
                result.add(new int[]{num, complement});
            }
            seen.add(num);
        }
        return result;
    }
}
public class AllPairsWithGivenSum {
	public static void main(String[] args) {
		Utility5 obj = new Utility5();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int S = 10;

        List<int[]> pairs = obj.findPairs(arr, S);
        System.out.println("Pairs with sum " + S + ":");
        for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
