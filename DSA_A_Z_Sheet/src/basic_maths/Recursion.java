package basic_maths;

import java.util.Arrays;

public class Recursion {

	/*
	 * Given an integer n, write a function to print all numbers from 1 to n
	 * (inclusive) using recursion.
	 * 
	 * You must not use any loops such as for, while, or do-while. The function
	 * should print each number on a separate line, in increasing order from 1 to n.
	 */
	public static void printNumbers(int N) {
		
		if(N==0) return;
		printNumbers(N-1);
		System.out.println(N);
		
		
	}
	
	/*
	 * Given an integer n, write a function to print all numbers from n to 1
	 * (inclusive) using recursion.
	 * 
	 * You must not use any loops such as for, while, or do-while. The function
	 * should print each number on a separate line, in decreasing order from n to 1
	 */
	
	public static void printNumbersInReverse(int N) {
		
		if(N==0) return;
		System.out.println(N);
		printNumbersInReverse(N-1);	
		
	}
	
	/*
	 * Given an integer N, return the sum of first N natural numbers. Try to solve
	 * this using recursion.
	 */
	public static void sumOfNumbersApproach1(int N,int sum) {
		
		if(N<1) {
			System.out.println(sum);
			return;
		}
		sumOfNumbersApproach1(N-1,sum+N);
		
	}
	
	public static int sumOfNumbersApproach2(int N) {
		
		if(N==1)return 1;
		
		return N + sumOfNumbersApproach2(N-1);
		
	}
	
	
	/*
	 * A factorial is the product of all positive integers up to a given number,
	 * represented by an exclamation mark (!). For example, \(4!=4\times 3\times
	 * 2\times 1=24\).
	 */
	
	public static int factorialNumber(int N) {
		
		if(N==1)return 1;
		
		return N * factorialNumber(N-1);
	}
	
	/*
	 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the
	 * Fibonacci sequence, such that each number is the sum of the two preceding
	 * ones, starting from 0 and 1.
	 */
	public static int fibNumber(int N) {
		
		if(N==0 || N==1)return N;
		
		return fibNumber(N-1)+ fibNumber(N-2);
	}
	
	/*
	 * Problem Statement: You are given an array. The task is to reverse the array
	 * and print it.
	 * 
	 * Examples:
	 * 
	 * Example 1: Input: N = 5, arr[] = {5,4,3,2,1} Output: {1,2,3,4,5} Explanation:
	 * Since the order of elements gets reversed the first element will occupy the
	 * fifth position, the second element occupies the fourth position and so on.
	 */
	
	public static void reverseArrayApproach1(int[] arr) {
		
		int n= arr.length;
		int start=0;
		int end=n-1;
		
		while(start<end) {
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void reverseArrayApproach2(int[] arr, int start, int end) {
		
		if(start<end) {
			int temp= arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			reverseArrayApproach2(arr, start+1, end-1);
		}
	}
	
	public static void printArray(int[] arr) {
		
		int n= arr.length;
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	 public static boolean isPalindrome(String s) {
	        
	        int start=0;
	        int end=s.length()-1;

	        while(start<end){
	            char r=s.charAt(start), l=s.charAt(end);
	            if(!Character.isLetterOrDigit(r))start++;
	            else if(!Character.isLetterOrDigit(l))end--;
	            else if(Character.toLowerCase(r)!=Character.toLowerCase(l))return false;
	            else{
	                start++;
	                end--;
	            }
	        }
	        return true;
	    }
	
	
	public static void main(String[] args) {
		
		//printNumbers(5);
		//printNumbersInReverse(5);
		
		//int result = sumOfNumbersApproach2(5);
		//int result =factorialNumber(5);
		//int result = fibNumber(4);
		
		//int[]arr = {1,2,3,4,5,6};
		//reverseArrayApproach1(arr);
		//reverseArrayApproach2(arr, 0, arr.length-1);
		//printArray(arr);
		
		
		//String str = "A man, a plan, a canal: Panama";
		String str = " ";
		boolean result = isPalindrome(str);
		
		System.out.println(result);
	}
}
