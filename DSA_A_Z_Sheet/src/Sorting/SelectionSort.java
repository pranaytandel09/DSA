package Sorting;

public class SelectionSort {
	
//	in selection sort we find min value within specific rage in every iteration
//	and if found we swap it with the element of i th position as i th is min element for every iteration
//	tc: for every case O(n2)
	
	public static int[] sortArray(int[] arr) {
		int N=arr.length;
		
		for(int i=0; i<N-1; i++) {
			
			int  min=i;
			for(int j=i+1; j<N; j++) {
				
				if(arr[min]>arr[j])min=j;
			}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,6,7,8,9,10,3,2,1};
		arr=sortArray(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
