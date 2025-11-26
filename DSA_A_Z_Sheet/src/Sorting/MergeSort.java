package Sorting;

public class MergeSort {

//	Merge sort is achieve by divide and concur rule where we divide the array till last element and during merging 
//	we sort the elements
//	tc: for every case O(nlog(n))
	
	public static void sortArray(int[] arr,int l, int h) {
		
		if(l<h) {
			int mid=l+(h-l)/2;
			sortArray(arr,l,mid);
			sortArray(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}

	private static void merge(int[] arr, int l, int mid, int h) {
		int n1= mid-l+1;
		int n2= h-mid;
		
		int[] a=new int[n1];
		int[] b=new int[n2];
		
		for(int i=0;i<n1; i++) {
			a[i]=arr[l+i];
		}
		
		for(int i=0;i<n2; i++) {
			b[i]=arr[mid+1+i];
		}
		
		int i=0, j=0,k=l;
		
		while(i<n1 && j<n2) {
			
			if(a[i]<=b[j]) {
				arr[k]=a[i];
				i++;
			}else {
				arr[k]=b[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=a[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=b[j];
			j++;
			k++;
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {3,5,6,7,8,9,10,3,2,1};
		sortArray(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
