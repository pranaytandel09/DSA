package ArrayProblemsEasy;

public class MoveZerosAtEnd {
	/*
	 * Given an integer array nums, move all the 0's to the end of the array. The
	 * relative order of the other elements must remain the same.
	 * This must be done in place, without making a copy of the array.
	 */
	
	/*
	 * Input: nums = [0, 1, 4, 0, 5, 2]
	 * Output: [1, 4, 5, 2, 0, 0]
	 * Explanation:
	 * Both the zeroes are moved to the end and the order of the other elements stay
	 * the same
	 */
	
	public static int[] moveZeros(int[] arr) {
		
		int n=arr.length;
		int i=0,j=0;
		
		while(j<n) {
			if(arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}
			j++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {0, 0, 3, 1, 4};
		//int[] arr={0, 1, 2, 4, 5, 6};
		arr=moveZeros(arr);
		for(int i: arr)
		System.out.print(i+" ");
	}
}
