package ArrayProblemsEasy;
import java.util.ArrayList;
import java.util.List;

public class UnionOfArray {

	/*
	 * Given two sorted arrays nums1 and nums2, return an array that contains the
	 * union of these two arrays. The elements in the union must be in ascending
	 * order.
	 * The union of two arrays is an array where all values are distinct and are
	 * present in either the first array, the second array, or both.
	 */
	
	/*
	 * Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]
	 * Output: [1, 2, 3, 4, 5, 7]
	 * Explanation:
	 * The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from
	 * nums2
	 */
	
	public static List<Integer> unionOfArray(int[] arr1,int[] arr2,int n1,int n2) {
		
		int i=0,j=0;
		int k=0;
		List<Integer> result= new ArrayList<>();
		
		while(i<n1 && j<n2) {
			
			if(arr1[i]<=arr2[j]) {
				result.add(arr1[i]);
				if(arr1[i]==arr2[j]) {
					i++;
					j++;
				}
				else {
					i++;
				}
			}else {
				result.add(arr2[j]);
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			result.add(arr1[i]);
			i++;
			k++;
		}
		while(j<n2) {
			result.add(arr2[j]);
			j++;
			k++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5};
		int[] arr2= {1, 2, 7};
		
		int n1 = arr.length;
		int n2 = arr2.length;
		
		List<Integer> result=new ArrayList<>();
		result=unionOfArray(arr,arr2,n1,n2);
		for(int i: result)
		System.out.print(i+" ");
	}
}
