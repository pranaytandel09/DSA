package ArrayProblemsHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

	/*
	 * Input: N = 5, r = 5, c = 3 Output: Element at position (r, c): 6 N-th row of
	 * Pascal’s triangle: 1 4 6 4 1 First n rows of Pascal’s triangle: 1 1 1 1 2 1 1
	 * 3 3 1 1 4 6 4 1 Explanation: Pascal triangle for first 5 rows is shown above.
	 */
	
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> result= new ArrayList<>();

	        for(int i=0; i<numRows; i++) {
	        	List<Integer> temp=  new ArrayList<>(Collections.nCopies(i+1, 1));
	        	
	        	for(int j=1; j<i; j++) {
	        		temp.set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
	        	}
	        	
	        	result.add(temp);
	        }
	        return result;
	    }


	public static void main(String[] args) {
		
		List<List<Integer>> result=generate(5);
		for(List<Integer> i:result) {
			for(Integer j: i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
