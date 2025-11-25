package Sorting;

public class InsertionSort {

//	in insertion sort we take an element every  time and we make sure that all the left element of it are lesser than the considered element
//	tc: for beast case O(n)
//		for medium and worst case O(n2)
	
	public static int[] sortArray(int[] arr) {
		int N=arr.length;
		
		for(int i=1; i<N; i++) {
			
			int  key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=key;
			
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
