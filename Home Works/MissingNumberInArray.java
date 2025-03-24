package com.homework;

class Utility1{
	int findMissingNumber(int arr[]) {
		int n = arr.length;
		int ans = -1;
		for(int i=0;i<n;i++) {
			if(arr[i]!=i+1)
				return i+1;
		}
		return ans;
	}
}
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility1 obj = new Utility1();
		int arr1[] = {1,2,3,4,6};
		int arr2[] = {1,2,3,4,5,6,8,9,10};
		System.out.println("Missing number in arr1:"+obj.findMissingNumber(arr1));
		System.out.println("Missing number in arr2:"+obj.findMissingNumber(arr2));
	}

}
