package ArrayProblemsEasy;

import java.util.Arrays;

public class FindMissingNumber {

	/*
	 * Given an integer array of size n containing distinct values in the range from
	 * 0 to n (inclusive), return the only number missing from the array within this
	 * range. Input: nums = [0, 2, 3, 1, 4] Output: 5 Explanation: nums contains 0,
	 * 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]
	 */

	// app 1: Brute Force

//	public static int missingNumber(int[] arr) {
//		int n=arr.length;
//		
//		for (int i = 1; i <= n; i++) {
//			boolean flag=false;
//			for (int j = 0; j < n; j++) {
//				if(i==arr[j]) {
//					flag=true;
//					break;
//				}
//			}
//			
//			if(!flag)return i;
//		}
//		return -1;
//	}
	
	//app 2: using hashmap or another array
	//optimal
//	public static int missingNumber(int[] arr) {
//		int n=arr.length;
//		int[] result = new int[n+1];
//		Arrays.fill(result, -1);
//		
//		for(int i=0; i<n; i++) {
//			result[arr[i]]=arr[i];
//		}
//		
//		for(int i=1; i<n+1; i++) {
//			if(result[i]==-1)return i;
//		}
//		return -1;
//	}
	
	//app3 : using basic addition 
	//optimal
//	public static int missingNumber(int[] arr) {
//		int n=arr.length;
//		int sum= n*(n+1)/2;
//		int sum2=0;
//		
//		for(int i=0; i<arr.length; i++) {
//			sum2+=arr[i];
//		}
//		
//		return sum-sum2;
//	}
	
	//app3 : using XOR 
	//XOR of same number =0 and XOR of number and zero is number itself
	//3^3=0 3^0=3
	//optimal 
		public static int missingNumber(int[] arr) {
			int n=arr.length;
			int xor1=0, xor2=0;
			
//			for(int i=1; i<=n; i++) {
//				xor1=xor1^i;
//			}
			
			for(int i=0;i<n; i++) {
				xor2=xor2^arr[i];
				xor1=xor1^i+1;
			}
			
			return xor1^xor2;
		}

	public static void main(String[] args) {
		int[] arr= {0, 2, 3, 1, 4};
		//int[] arr={0, 1, 2, 4, 5, 6};
		int missingValue=missingNumber(arr);
		System.out.println(missingValue);
	}

}
