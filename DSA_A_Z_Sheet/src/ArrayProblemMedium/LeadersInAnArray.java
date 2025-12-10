package ArrayProblemMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

	/*
	 * Example 1: Input: arr = [4, 7, 1, 0] Output: 7 1 0 Explanation: The rightmost
	 * element (0) is always a leader. 7 and 1 are greater than the elements to
	 * their right, making them leaders as well.
	 * 
	 * Example 2: Input: arr = [10, 22, 12, 3, 0, 6] Output: 22 12 6 Explanation: 6
	 * is a leader because there are no elements after it. 12 is greater than all
	 * the elements to its right (3, 0, 6), and 22 is greater than 12, 3, 0, 6,
	 * making them leaders as well.
	 */
	
//	Approach 1:Brute force (n2)
//	private static List<Integer> findLeaders(int[] arr) {
//		List<Integer>result= new ArrayList<>();
//		
//		for(int i=0; i<arr.length-1; i++) {
//			boolean leader=true;
//			
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j]>=arr[i]) {
//					leader=false;
//					break;
//				}
//			}
//			
//			if(leader)result.add(arr[i]);
//		}
//		
//		result.add(arr[arr.length-1]);
//		return result;
//	}
	
//	Approach 2:Optimal approach (n)
	private static List<Integer> findLeaders(int[] arr) {
		List<Integer>result= new ArrayList<>();
		
		int n=arr.length;
		int max=arr[n-1];
		result.add(max);
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i]>max) {
				result.add(arr[i]);
				max=arr[i];
			}
		}
		 Collections.reverse(result);
		 return result;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {4, 7, 1, 0};
		List<Integer> result=findLeaders(arr);
		for(Integer i:result)
		System.out.print(i+" ");
	}
	

}
