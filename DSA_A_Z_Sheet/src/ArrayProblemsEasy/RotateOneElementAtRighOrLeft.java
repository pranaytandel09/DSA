package ArrayProblemsEasy;

public class RotateOneElementAtRighOrLeft {

	/*Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
	 * Input: nums = [1, 2, 3, 4, 5, 6], k = 2
	 * Output: nums = [3, 4, 5, 6, 1, 2]
	 * Explanation:
	 * [6,5,4,3,2,1] --> reverse entire array
	 * [6,5,4,3,1,2] --> reverse k elements
	 * [3,4,5,6,1,2] --> reverse remaining n-k elements
	 * rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
	 * rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
	 */
	
	/*
	 * approach 1: Brute force--> take a dummy array store first k elements
	 * then shift the k to n-1 elements at left by k places and then add the saved elements at last
	 * 
	 */
	
//	public static int[] rotateAtLeftBykPlace(int[] arr, int k){
//		int n=arr.length;
//		if(n==0 || k==0)return arr;
//		k=k>n?k-n:k;
//		
//		int[] temp= new int[k];
//		for(int i=0; i<k; i++) {
//			temp[i]=arr[i];
//		}
//		
//		
//		for(int i=k; i<n; i++) {
//			arr[i-k]=arr[i];
//		}
//
//		for(int i=0; i<k; i++) {
//			arr[n-k+i]=temp[i];
//		}
//		
//		return arr;
//		
//	}
	
	/*
	 * approach 1: Optimal--> instead of storing it in dummy array we can modify the existing array
	 * when we want to rotate the array at left side by k times then we can follow this
	 * [2,1,3,4,5,6] --> reverse 1st k elements
	 * [2,1,6,5,4,3] --> reverse remaining n-k elements
	 * [3,4,5,6,1,2] --> reverse entire array 
	 */
	
//	public static int[] rotateAtLeftBykPlace(int[] arr, int k){
//		int n = arr.length;
//		
//		if(n==0 || k==0)return arr;
//		
//		k=k>n?k-n:k;
//		
//		// reverse 1st k elements.
//		arr=reverseArray(arr,0,k-1);
//		//reverse remaining n-k elements from k to n
//		arr=reverseArray(arr,k,n-1);
//		//reverse entire array
//		arr=reverseArray(arr,0,n-1);
//		
//		return arr;
//		
//	}

	//=============================================================================================================
	
	/* Given an integer array nums, rotate the array to the right by k places. 
	/*
	 * Input: nums = [1, 2, 3, 4, 5,6]
	 * k=3
	 * Output: [4,5,6,1,2,3]
	 * Explanation:
	 * Initially, nums = [1, 2, 3, 4, 5,6]
	 * Rotating to right by k -> nums = [4,5,6,1,2,3]
	 */
	
	/*
	 * approach 1: Brute force--> take a dummy array store last k elements(from n-k to n)
	 * then shift the 0 to k-1 elements at right by i+k places and then add then append the saved elements at first
	 * 
	 */
	
//	public static int[] rotateAtRightBykPlace(int[] arr, int k){
//		int n=arr.length;
//		if(n==0 || k==0)return arr;
//		
//		int[] temp= new int[k];
//		for(int i=0; i<k; i++) {
//			temp[i]=arr[n-k+i];
//		}
//		
//		
//		for(int i=n-k-1; i>=0; i--) {
//			arr[i+k]=arr[i];
//		}
//
//		for(int i=0; i<k; i++) {
//			arr[i]=temp[i];
//		}
//		
//		return arr;
//		
//	}
	
	/*
	 * approach 1: Optimal--> instead of storing it in dummy array we can modify the existing array
	 * when we want to rotate the array at left side by k times then we can follow this
	 * [6,5,4,3,2,1] --> reverse entire array
	 * [6,5,4,3,1,2] --> reverse 1st k elements
	 * [3,4,5,6,1,2] --> reverse remaining n-k elements
	 */
	
	public static int[] rotateAtRightBykPlace(int[] arr, int k){
		int n = arr.length;
		if(n==0||k==0)return arr;
		k=k>n?k-n:k;
		
		//reverse entire array
		arr=reverseArray(arr,0,n-1);
		
		//reverse 1st k elements
		arr=reverseArray(arr,0,k-1);
		
		//reverse remaining n-k from k to n-1
		arr=reverseArray(arr,k,n-1);
		
		return arr;
		
	}
	
	private static int[] reverseArray(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5,6};
		//arr=rotateAtLeftBykPlace(arr,2);
		arr=rotateAtRightBykPlace(arr,4);
		for(int i:arr)
		System.out.print(i+" ");
	}
	
}
