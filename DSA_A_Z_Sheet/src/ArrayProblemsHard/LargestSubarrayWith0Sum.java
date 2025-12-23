package ArrayProblemsHard;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWith0Sum {

	/*
	 * Given an array containing both positive and negative integers, we have to
	 * find the length of the longest subarray with the sum of all elements equal to
	 * zero.
	 */
	
	/*
	 * Example 1: Input: N = 6, array[] = {9, -3, 3, -1, 6, -5} Result: 5
	 * Explanation: The following subarrays sum to zero: - {-3, 3} - {-1, 6, -5} -
	 * {-3, 3, -1, 6, -5} The length of the longest subarray with sum zero is 5.
	 * 
	 * Example 2: Input: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10} Result: 8
	 * Explanation: Subarrays with sum zero: - {-2, 2} - {-8, 1, 7} - {-2, 2, -8, 1,
	 * 7} - {6, -2, 2, -8, 1, 7, 4, -10} The length of the longest subarray with sum
	 * zero is 8.
	 */
	
	//optimal approach : n
	private static int largestSubarrayWith0Sum(int[] arr, int n) {
		
		Map<Integer, Integer>map= new HashMap<>();
		int max=0;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			
			sum+=arr[i];
			if(sum==0) {
				max=Math.max(max, i+1);
			}else if(map.containsKey(sum)) {
				max=Math.max(max, i-map.get(sum));
			}else {
				map.put(sum, i);
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {

		// sample input
        int[] A = new int[]{6, -2, 2, -8, 1, 7, 4, -10};
        // compute size
        int n = A.length;
        // compute result
        int ans = largestSubarrayWith0Sum(A, n);
        // print result
        System.out.println(ans);
	}

	
}
