package ArrayProblemMedium;

public class LongestConsecutiveSequenceInAnArray {

	/*
	 * Example 1: Input: nums = [100, 4, 200, 1, 3, 2] Output: 4 Explanation: The
	 * longest sequence of consecutive elements in the array is [1, 2, 3, 4], which
	 * has a length of 4. This sequence can be formed regardless of the initial
	 * order of the elements in the array.
	 * 
	 * Example 2: Input: nums = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1] Output: 9
	 * Explanation: The longest sequence of consecutive elements in the array is [0,
	 * 1, 2, 3, 4, 5, 6, 7, 8], which has a length of 9.
	 */	
	//[1,0,3,4,100,200]
	//Brute force-> O(nlogn) based on sorting 
	public static int longestConsecutiveSequence(int[] nums) {
        
		quickSort(nums,0,nums.length-1);
		int ans=1;
		int max=0;
		for(int i=1; i<nums.length; i++) {
			if(nums[i]==nums[i-1]+1) {
				ans++;
			}else {
				max=Math.max(ans, max);
				ans=1;
			}
		}
        return max;
    }
	
	private static void quickSort(int[] nums, int l, int h) {
		
		if(l<h) {
			int temp=partition(nums,l,h);
			quickSort(nums,l,temp-1);
			quickSort(nums,temp+1,h);
		}
		
	}

	private static int partition(int[] nums, int l, int h) {
		
		int pivot=nums[h];
		int i=l-1;
		for(int j=l; j<h; j++) {
			if(nums[j]<=pivot) {
				i++;
				swap(nums,i,j);
			}
		}
		
		swap(nums,i+1,h);
		return i+1;
	}

	private static void swap(int[] nums, int i, int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {100, 4, 200, 10, 3, 222};
		int count=longestConsecutiveSequence(arr);
		System.out.print(count);
	
	}
	
}
