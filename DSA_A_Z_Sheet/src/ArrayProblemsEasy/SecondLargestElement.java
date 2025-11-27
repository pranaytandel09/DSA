package ArrayProblemsEasy;

public class SecondLargestElement {

	/*
	 * Given an array of integers nums, return the second-largest element in the
	 * array. If the second-largest element does not exist, return -1. Input: nums =
	 * [8, 8, 7, 6, 5]
	 * 
	 * Output: 7
	 * 
	 * Explanation:
	 * 
	 * The largest value in nums is 8, the second largest is 7
	 * 
	 * We will need four variables: small, second_small, large, and second_large. Initialize small and second_small to INT_MAX, and large and second_large to INT_MIN.
Second Smallest Algorithm:
If the current element is smaller than 'small', update the values of second_small and small.
Else if the current element is smaller than 'second_small', update the value of second_small.
After traversing the array, the second smallest element will be stored in the variable second_small.
Second Largest Algorithm:
If the current element is larger than 'large', update the values of second_large and large.
Else if the current element is larger than 'second_large', update the value of second_large.
After traversing the array, the second largest element will be stored in the variable second_large.
	 */
	
	//Approach 1:
//	public static int secondMaxElement(int[] arr) {
//		
//		int max=Integer.MIN_VALUE;
//		
//		for(int i: arr) {
//			max=Math.max(i, max);
//		}
//		
//		int secondMax=-1;
//		for(int i: arr) {
//			if(i>secondMax && i<max) {
//				secondMax=i;
//			}
//		}
//		
//		return secondMax;
//	}
	
	public static int secondMaxElement(int[] arr) {
		
		int max=-1;
		int secondMax=-1;
		
		for(int i: arr) {
			
			if(i>max) {
				secondMax=max;
				max=i;
			}
			else if(i>secondMax && i!=max) {
				secondMax=i;
			}
		}
		
		return secondMax;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,23,45,3,2,456,67};
		//int[] arr={10, 10, 10, 10, 10};
		int secondMaxElement = secondMaxElement(arr);
		System.out.println(secondMaxElement);
	}
}
