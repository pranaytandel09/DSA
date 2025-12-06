package ArrayProblemsEasy;

public class SingleNumber1 {

	/*
	 * Given an array of nums of n integers. Every integer in the array appears
	 * twice except one integer. Find the number that appeared once in the array.
	 * Input : nums = [1, 2, 2, 4, 3, 1, 4]
	 * 
	 * Output : 3
	 * 
	 * Explanation : The integer 3 has appeared only once.
	 */
	
	 public static int singleNumber(int[] nums) {
	        
	        int xor=0;
	        for(int i:nums)xor^=i;
	        return xor;
	    }
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 2, 4, 3, 1, 4};
		int result=singleNumber(arr);
		System.out.print(result);
	}
}
