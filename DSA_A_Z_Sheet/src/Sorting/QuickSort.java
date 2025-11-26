package Sorting;

public class QuickSort {

//	Quick sort is achieve by fixing an element to it's correct position such that it's left hand side element will be smaller 
//	and right hand side element will be larger acheive by partition tech
//	tc: for every case O(nlog(n))
	
	public static void sortArray(int[] arr,int l, int h) {
		
		if(l<h) {
			int temp= partition(arr,l,h);
			sortArray(arr,l,temp-1);
			sortArray(arr,temp+1,h);
		}
	}

	private static int partition(int[] arr, int l, int h) {
		
		int pivot=arr[h];
		int i=l-1;
		for(int j=l; j<h; j++) {
			
			if(arr[j]<=pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,h);
		return i+1;
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		int[] arr= {3,5,6,7,8,9,10,3,2,1};
		sortArray(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
