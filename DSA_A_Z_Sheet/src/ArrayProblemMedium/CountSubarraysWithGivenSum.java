package ArrayProblemMedium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenSum {

	/*
	 * Input : N = 4, array[] = {3, 1, 2, 4}, k = 6 Output: 2 Explanation: The
	 * subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
	 * 
	 * Input: N = 3, array[] = {1,2,3}, k = 3 Output: 2 Explanation: The subarrays
	 * that sum up to 3 are [1, 2], and [3].
	 */

	/*
	 * solution: We will apply the above process for all possible indices of the
	 * given array. The possible values of the index i can be from 0 to n-1(where n
	 * = size of the array) First, we will declare a map to store the prefix sums
	 * and their counts. Then, we will set the value of 0 as 1 on the map. Then we
	 * will run a loop(say i) from index 0 to n-1(n = size of the array). For each
	 * index i, we will do the following: We will add the current element i.e.
	 * arr[i] to the prefix sum. We will calculate the prefix sum i.e. x-k, for
	 * which we need the occurrence. We will add the occurrence of the prefix sum
	 * x-k i.e. mpp[x-k] to our answer. Then we will store the current prefix sum in
	 * the map increasing its occurrence by 1.
	 */

	/*
	 * Question: Why do we need to set the value of 0? Let’s understand this using
	 * an example. Assume the given array is [3, -3, 1, 1, 1] and k is 3. Now, for
	 * index 0, we get the total prefix sum as 3, and k is also 3. So, the prefix
	 * sum of the remove-part should be x-k = 3-3 = 0. Now, if the value is not
	 * previously set for the key 0 in the map, we will get the default value 0 for
	 * the key 0 and we will add 0 to our answer. This will mean that we have not
	 * found any subarray with sum 3 till now. But this should not be the case as
	 * index 0 itself is a subarray with sum k i.e. 3. So, in order to avoid this
	 * situation we need to set the value of 0 as 1 on the map beforehand.
	 */
	public static int subarraySum(int[] nums, int k) {

		int prefixSum = 0;
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(prefixSum, 1);

		for (int i = 0; i < nums.length; i++) {
			prefixSum = prefixSum + nums[i];
			int value = prefixSum - k;

			if (map.containsKey(value)) {
				count = count + map.get(value);
			}
			map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
			;
		}

		return count;

	}

	public static void main(String[] args) {

		int[] arr = {3, 1, 2, 4};
		int count = subarraySum(arr,6);
			System.out.print(count+ " ");
	}
}
