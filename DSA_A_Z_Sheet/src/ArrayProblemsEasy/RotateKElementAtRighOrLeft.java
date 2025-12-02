package ArrayProblemsEasy;

public class RotateKElementAtRighOrLeft {

	/* Given an integer array nums, rotate the array to the left by one. 
	/*
	 * Input: nums = [1, 2, 3, 4, 5]
	 * Output: [2, 3, 4, 5, 1]
	 * Explanation:
	 * Initially, nums = [1, 2, 3, 4, 5]
	 * Rotating once to left -> nums = [2, 3, 4, 5, 1]
	 */
	
	/*
	 * approach 1: Brute force--> take a dummy array store values from 1 to n-1 then
	 * store the 0th value or store the 0th value then shift the elements to left by
	 * one place and then place store value at end
	 */
	
//	public static int[] rotateAtLeftByOnePlace(int[] arr){
//		int n=arr.length;
//		int[] temp= new int[1];
//		temp[0]=arr[0];
//		
//		for(int i=1; i<n; i++) {
//			arr[i-1]=arr[i];
//		}
//		
//		arr[n-1]=temp[0];
//		return arr;
//		
//	}
	
	/*
	 * approach 1: Optimal--> instead of storing it in dummy array use a variable to store it
	 */
	
	public static int[] rotateAtLeftByOnePlace(int[] arr){
		int n=arr.length;
		int temp=arr[0];
		
		for(int i=1; i<n; i++) {
			arr[i-1]=arr[i];
		}
		
		arr[n-1]=temp;
		return arr;
		
	}
	
	//=============================================================================================================
	
	/* Given an integer array nums, rotate the array to the right by one. 
	/*
	 * Input: nums = [1, 2, 3, 4, 5]
	 * Output: [5,1,2, 3, 4]
	 * Explanation:
	 * Initially, nums = [1, 2, 3, 4, 5]
	 * Rotating once to right -> nums = [5,1,2, 3, 4]
	 */
	
	/*
	 * approach 1: Brute force--> take a dummy array store N-1th value first and then  values from 0 to n-2.
	 * or store the n-1th value then shift the elements to right by
	 * one place and then place store value at 0th place
	 */
	
//	public static int[] rotateAtRightByOnePlace(int[] arr){
//	int n=arr.length;
//	int[] temp= new int[1];
//	temp[0]=arr[n-1];
//	
//	for(int i=n-2; i>=0; i--) {
//		arr[i+1]=arr[i];
//	}
//	
//	arr[0]=temp[0];
//	return arr;
//	
//}
	
	/*
	 * approach 1: Optimal--> instead of storing it in dummy array use a variable to store it
	 */
	
	public static int[] rotateAtRightByOnePlace(int[] arr){
		int n=arr.length;
		int temp=arr[n-1];
		
		for(int i=n-2; i>=0; i--) {
			arr[i+1]=arr[i];
		}
		
		arr[0]=temp;
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
//		arr=rotateAtLeftByOnePlace(arr);
		arr=rotateAtRightByOnePlace(arr);
		for(int i:arr)
		System.out.print(i+" ");
	}
	
}
