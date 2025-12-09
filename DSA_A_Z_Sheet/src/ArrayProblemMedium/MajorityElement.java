package ArrayProblemMedium;

public class MajorityElement {
	/*
	 * Given an array nums of size n, return the majority element.
	 * 
	 * The majority element is the element that appears more than ⌊n / 2⌋ times. You
	 * may assume that the majority element always exists in the array.
	 * Example 1:
	 * 
	 * Input: nums = [3,2,3] Output: 3 Example 2:
	 * 
	 * Input: nums = [2,2,1,1,1,2,2] Output: 2
	 */
	
	public static int majorityElement(int[] nums) {
        int n=nums.length;
        int cnt=0,el=0;

        for(int i=0; i<n; i++){
            if(cnt==0){
                cnt=1;
                el=nums[i];
            }else if(el==nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

        cnt=0;
        for(int i:nums){
            if(el==i)cnt++;
        }

        if(cnt> n/2)return el;
        return -1;
    }
	
	public static void main(String[] args) {
		
		int[] arr= {3,2,3};
		int el=majorityElement(arr);
		System.out.print(el);
	}
}
