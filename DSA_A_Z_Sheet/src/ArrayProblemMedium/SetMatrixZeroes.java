package ArrayProblemMedium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetMatrixZeroes {

	/*
	 * Given a matrix if an element in the matrix is 0 then you will have to set its
	 * entire column and row to 0 and then return the matrix.. Input:
	 * matrix=[[1,1,1],[1,0,1],[1,1,1]] Output: [[1,0,1],[0,0,0],[1,0,1]]
	 * Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be
	 * set to 0.
	 * 
	 * Input: matrix=[[0,1,2,0],[3,4,5,2],[1,3,1,5]]
	 * Output:[[0,0,0,0],[0,4,5,0],[0,3,1,0]] Explanation:Since matrix[0][0]=0 and
	 * matrix[0][3]=0. Therefore 1st row, 1st column and 4th column will be set to 0
	 */

	//brute force:
//	public static void setZeroes(int[][] matrix, int n, int m) {
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j < m; j++) {
//
//				if (matrix[i][j] == 0) {
//					for (int k = 0; k < n; k++) {
//						if (matrix[k][j] != 0)
//							matrix[k][j] = -1001;
//					}
//
//					for (int k = 0; k < m; k++) {
//						if (matrix[i][k] != 0)
//							matrix[i][k] = -1001;
//					}
//				}
//			}
//		}
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j < m; j++) {
//				if (matrix[i][j] == -1001) {
//					matrix[i][j] = 0;
//				}
//			}
//		}
//	}

	//better solution
	//use two array one to store the row to be zeroed and second is to store clm
	public static void setZeroes(int[][] matrix, int n, int m) {

		boolean[] row=new boolean[n];
		boolean[] clm=new boolean[m];
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				if (matrix[i][j] == 0) {
					row[i]=true;
					clm[j]=true;
				}
			}
		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				if (row[i]||clm[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int[][] mat = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int n = mat.length;
		int m = mat[0].length;
		setZeroes(mat, n, m);
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
	}
}
