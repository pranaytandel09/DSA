package ArrayProblemsHard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	/*
	 * Given an integer array of size n, find all elements that appear more than ⌊
	 * n/3 ⌋ times.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,2,3] Output: [3] Example 2:
	 * 
	 * Input: nums = [1] Output: [1] Example 3:
	 * 
	 * Input: nums = [1,2] Output: [1,2]
	 */

	/*
	 * Can there be more than 2 majority elements? To understand why there can't be
	 * more than two majority elements (elements that appear more than n/3 times) in
	 * an array of size n, let's consider the following reasoning: A majority
	 * element must appear more than n/3 times. Let’s assume there are more than two
	 * majority elements, say A, B, and C. The combined frequency of these three
	 * elements would be: frequency of A + frequency of B + frequency of C > n/3 +
	 * n/3 + n/3 = n. Since the total occurrences of all elements cannot exceed n
	 * (the size of the array), the combined frequency of any three elements each
	 * appearing more than n/3 times would exceed the total size of the array,
	 * leading to a contradiction. Therefore, it is mathematically impossible to
	 * have more than two elements that each appear more than n/3 times in the
	 * array.
	 */

	//approach 1 : brute force count for each element
//	public static List<Integer> majorityElement(int[] nums) {
//		List<Integer> result = new ArrayList<>();
//		int n = nums.length;
//		for (int i = 0; i < n; i++) {
//			if ((result.size() == 0 || result.get(0) != nums[i]) && (result.size() < 2 || result.get(1) != nums[i])) {
//
//				int count = 0;
//
//				for (int j = i; j < n; j++) {
//					if (nums[j] == nums[i])
//						count++;
//				}
//
//				if (count > n / 3)
//					result.add(nums[i]);
//				if (result.size() == 2)
//					break;
//			}
//
//		}
//
//		return result;
//	}
	
	//approach 2: using hashMap
//	public static List<Integer> majorityElement(int[] nums) {
//		List<Integer> result = new ArrayList<>();
//		Map<Integer, Integer>map=new HashMap<>();
//		int n = nums.length;
//		
//		
//		for (int i = 0; i < n; i++) {
//			
//			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
//			if(map.get(nums[i])>n/3)result.add(nums[i]);
//			
//			if(result.size()==2)break;
//
//		}
//
//		return result;
//	}
	
	//approach 3 : as there can be only two elements so first find those element 
	//then calculate there occurances and check for condition
	public static List<Integer> majorityElement(int[] nums) {
		  int n = nums.length;
	        int cnt1 = 0, cnt2 = 0;
	        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;

	        for (int i = 0; i < n; i++) {
	            if (cnt1 == 0 && el2 != nums[i]) {
	                cnt1 = 1;
	                el1 = nums[i]; 
	            } else if (cnt2 == 0 && el1 != nums[i]) {
	                cnt2 = 1;
	                el2 = nums[i]; 
	            } else if (nums[i] == el1) {
	                cnt1++;
	            } else if (nums[i] == el2) {
	                cnt2++; 
	            } else {
	                cnt1--; 
	                cnt2--;
	            }
	        }

	        cnt1 = 0; cnt2 = 0; 
	        for (int i = 0; i < n; i++) {
	            if (nums[i] == el1) cnt1++; 
	            if (nums[i] == el2) cnt2++;
	        }

	        int mini = n / 3 + 1;
	        List<Integer> result = new ArrayList<>(); 
	        if (cnt1 >= mini) result.add(el1);
	        if (cnt2 >= mini && el1 != el2) result.add(el2);

	        return result;
	}

	public static void main(String[] args) {
		int[] arr= {1, 2, 1, 1, 3, 2, 2};
		List<Integer> result = majorityElement(arr);
			for (Integer j : result) {
				System.out.print(j + " ");
			}

	}
}
