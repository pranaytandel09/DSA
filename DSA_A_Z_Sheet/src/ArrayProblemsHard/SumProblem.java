package ArrayProblemsHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumProblem {

	/*
	 * Given an integer array nums. Return all triplets such that:
	 * 
	 * 
	 * 
	 * i != j, i != k, and j != k
	 * 
	 * 
	 * nums[i] + nums[j] + nums[k] == 0.
	 * 
	 * 
	 * Notice that the solution set must not contain duplicate triplets. One element
	 * can be a part of multiple triplets. The output and the triplets can be
	 * returned in any order.
	 * 
	 * 
	 * Example 1
	 * 
	 * Input: nums = [2, -2, 0, 3, -3, 5]
	 * 
	 * Output: [[-2, 0, 2], [-3, -2, 5], [-3, 0, 3]]
	 * 
	 * Explanation:
	 * 
	 * nums[1] + nums[2] + nums[0] = 0
	 * 
	 * nums[4] + nums[1] + nums[5] = 0
	 * 
	 * nums[4] + nums[2] + nums[3] = 0
	 * 
	 * Example 2
	 * 
	 * Input: nums = [2, -1, -1, 3, -1]
	 * 
	 * Output: [[-1, -1, 2]]
	 * 
	 * Explanation:
	 * 
	 * nums[1] + nums[2] + nums[0] = 0
	 * 
	 * Note that we have used two -1s as they are separate elements with different
	 * indexes
	 * 
	 * But we have not used the -1 at index 4 as that would create a duplicate
	 * triplet
	 */

	public static List<List<Integer>> threeSum(int[] nums) {
		// sort the array;
		Arrays.sort(nums);

		Set<List<Integer>> result = new HashSet<>();
		int N = nums.length;

		for (int i = 0; i < N; i++) {
			// look for duplicates and skips it
			if (i > 0 && nums[i] == nums[i - 1])
				i++;

			int start = i + 1, end = N - 1;
			while (start < end) {
				int sum = nums[i] + nums[start] + nums[end];
				if (sum == 0) {
					List<Integer> temp = Arrays.asList(nums[i], nums[start], nums[end]);
					result.add(temp);
					start++;
					end--;

					while (start < end && nums[start] == nums[start - 1]) {
						start++;
					}

					while (start < end && nums[end] == nums[end + 1]) {
						end--;
					}

				} else if (sum > 0)
					end--;
				else
					start++;
			}
		}

		return new ArrayList<>(result);

	}

	public static void main(String[] args) {
		int[] arr = { 2, -1, -1, 3, -1 };
		List<List<Integer>> result = threeSum(arr);
		for (List<Integer> i : result)
			for (Integer j : i) {
				System.out.print(j + ", ");
			}

		System.out.println();

	}
}
