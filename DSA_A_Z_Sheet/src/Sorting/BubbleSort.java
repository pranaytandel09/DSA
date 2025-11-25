package Sorting;

import java.util.Arrays;

public class BubbleSort {
	
//	in bubble sort at every itteration the end element will be 
//	largest of all
//	tc: for best case O(n)
//		for medium and worst case O(n2)
	
	public static int[] sortArray(int[] arr) {
		int N=arr.length;
		
		for(int i=0; i<N-1; i++) {
			boolean flag=true;
			
			for(int j=0; j<N-i-1; j++) {
				
				if(arr[j]>arr[j+1]) {
					flag=false;
					System.out.println("not sorted");
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			if(flag)break;
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		int[] arr= {3,5,6,7,8,9,10,13,21,111};
		arr=sortArray(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
