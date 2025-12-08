package ArrayProblemMedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumProblem {
	
	/*
	 * Given an array of integers arr[] and an integer target. 1st variant: Return
	 * YES if there exist two numbers such that their sum is equal to the target.
	 * Otherwise, return NO.
	 * 
	 * 2nd variant: Return indices of the two numbers such that their sum is equal
	 * to the target. Otherwise, we will return {-1, -1}.
	 * 
	 * Input: N = 5, arr[] = {2,6,5,8,11}, target = 14 Output : YES Explanation:
	 * arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second
	 * variant output will be : [1,3].
	 * 
	 * Input: N = 5, arr[] = {2,6,5,8,11}, target = 15 Output : NO. Explanation:
	 * There exist no such two numbers whose sum is equal to the target.
	 */
	
	public static int[] twoSum(int[] nums, int target) {
        int[] res= new int[2];
        Arrays.fill(res, -1);

        Map<Integer,Integer>map= new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
        	if(map.containsKey(target-nums[i])) {
        		res[0]=map.get(target-nums[i]);
        		res[1]=i;
        	}
        	map.put(nums[i], i);
        }
       
        return res;
    }


	public static void main(String[] args) {
		
		int[] arr= {2,6,5,8,11};
		int[] result=twoSum(arr,15);
		for(int i:result)
		System.out.print(i+" ");
	}
}
