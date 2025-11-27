package ArrayProblemsEasy;

public class FindMaxElement {

	/*
	 * Problem Statement: Given an array, we have to find the largest element in the
	 * array. Example 1: Input: arr[] = {2, 5, 1, 3, 0} Output: 5 Explanation: 5 is
	 * the largest element in the array.
	 */
	
	public static int maxElement(int[] arr) {
		
		int max=Integer.MIN_VALUE;
		
		for(int i: arr) {
			max=Math.max(i, max);
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,23,45,3,2,456,67};
		int maxElement = maxElement(arr);
		System.out.println(maxElement);
	}
}
