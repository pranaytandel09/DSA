package ArrayProblemsEasy;

import java.util.LinkedHashSet;

public class RemoveDuplicateInPlace {

	/*
	 * Given an integer array nums sorted in non-decreasing order, remove all
	 * duplicates in-place so that each unique element appears only once.
	 * 
	 * Return the number of unique elements in the array.
	 * 
	 * If the number of unique elements be k, then,
	 * Change the array nums such that the first k elements of nums contain the
	 * unique values in the order that they were present originally. The remaining
	 * elements, as well as the size of the array does not matter in terms of
	 * correctness. The driver code will assess correctness by printing and checking
	 * only the first k elements of the modified array.
	 * An array sorted in non-decreasing order is an array where every element to
	 * the right of an element is either equal to or greater in value than that
	 * element.
	 */
	
	/*
	 * Input: nums = [0, 0, 3, 3, 5, 6]
	 * Output: 4
	 * Explanation:
	 * Resulting array = [0, 3, 5, 6, _, _]
	 * There are 4 distinct elements in nums and the elements marked as _ can have
	 * any value.
	 */
	
	//approach1 : take an set and all arr elements into it
	
//	public static int removeDuplicates(int[] arr) {
//		LinkedHashSet<Integer> result = new LinkedHashSet<>();
//		
//		for(int i: arr)result.add(i);
//		
//		return result.size();
//	}
	
	//approach 2:
	//use two pointers to remove the duplicate where both pointers will start from 0th position 
	
	public static int removeDuplicates(int[] arr) {
		if(arr.length==0)return 0;
		
		int i=0;
		
		for(int j=1; j<arr.length; j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		
		return i+1;
	}
	
	public static void main(String[] args) {
		//int[] arr= {0, 0, 3, 3, 5, 6};
		int[] arr={0,0,1,1,1,2,2,3,3,4};
		int res=removeDuplicates(arr);
		System.out.println(res);
	}
}
