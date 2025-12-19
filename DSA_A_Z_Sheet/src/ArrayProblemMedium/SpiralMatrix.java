package ArrayProblemMedium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

//	Given an m x n matrix, return all elements of the matrix in spiral order.
	
//	Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//			Output: [1,2,3,6,9,8,7,4,5]
//					
//	Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//			Output: [1,2,3,4,8,12,11,10,9,5,6,7]
	
	 public static List<Integer> spiralOrder(int[][] matrix) {
	        
	        List<Integer> ans= new ArrayList<>();
	        int n= matrix.length;
	        int m=matrix[0].length;
	        int i=0,j=0;
	        while(matrix[i][j]!=-101){

	            while(j<m && matrix[i][j]!=-101){
	                ans.add(matrix[i][j]);
	                matrix[i][j]=-101;
	                j++;
	            }
	            i++;j--;
	            while(i<n && matrix[i][j]!=-101){
	                ans.add(matrix[i][j]);
	                matrix[i][j]=-101;
	                i++;
	            }
	            i--;j--;
	            while(j>=0 && matrix[i][j]!=-101){
	                ans.add(matrix[i][j]);
	                matrix[i][j]=-101;
	                j--;
	            }
	            i--;j++;
	            while(i>=0 && matrix[i][j]!=-101){
	                ans.add(matrix[i][j]);
	                matrix[i][j]=-101;
	                i--;
	            }
	            i++;j++;
	            if(i<0 || i>=n || j<0 || j>=m)break;
	        }
	        return ans;
	    }
	
	
	 public static void main(String[] args) {
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        List<Integer> spiralOrder = spiralOrder(matrix);

	        // Print rotated matrix
	        for (int i : spiralOrder) {
	                System.out.print(i + ",");
	        }
	    
}
}
