package com.geekster.assignment;

public class MissingNo {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,8,9,10,11,12,13,14,15};
		int sum = 0;
		int n = 15;
		int sumofnnumbers = (n*(n+1))/2;
		for(int i = 0;i <arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Missing Number :" + (sumofnnumbers-sum));

	}

}
