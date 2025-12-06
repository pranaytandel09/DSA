package ArrayProblemsEasy;

import java.util.ArrayList;
import java.util.List;

public class CountMaximumConsecutiveOnes {

	/*
	 * Given an array that contains only 1 and 0 return the count of maximum
	 * consecutive ones in the array.. Example 1: Input: prices = {1, 1, 0, 1, 1, 1}
	 * Output: 3 Explanation: There are two consecutive 1’s and three consecutive
	 * 1’s in the array out of which maximum is 3.
	 * 
	 * Example 2: Input: prices = {1, 0, 1, 1, 0, 1} Output: 2 Explanation: There
	 * are two consecutive 1's in the array.
	 */
	
	
	    public static int findMaxConsecutiveOnes(int[] nums) {
	        
	        int cnt=0;
	        int max=0;

	        for(int i=0; i<nums.length; i++){
	            if(nums[i]==1){
	                cnt++;
	            }else{
	                cnt=0;
	            }

	            max=Math.max(max,cnt);
	        }
	        return max;
	    }
	
	
	public static void main(String[] args) {
		//int[] arr= {1, 1, 0, 1, 1, 1};
		int[] arr= {1, 0, 1, 1, 0, 1};
		int result=findMaxConsecutiveOnes(arr);
		System.out.print(result);
	}


}


