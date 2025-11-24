package basic_maths;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapProblems {

	/*
	 * Given an array nums of size n which may contain duplicate elements. Rreturn a
	 * list of pairs where each pair contains a unique element from the array and
	 * its frequency in the array. You may return the result in any order, but each
	 * element must appear exactly once in the output.
	 */
	
	 public static List<List<Integer>> countFrequencies(int[] nums) {
	        // Your code goes here
	        HashMap<Integer,Integer>map= new HashMap<>();
	        for(int i: nums){
	            if(map.containsKey(i))map.put(i,map.get(i)+1);
	            else{
	                map.put(i,1);
	            } 
	        }

	        List<List<Integer>> result= new ArrayList<>();
	        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
	            List<Integer> data= new ArrayList<>();
	            
	            data.add(entry.getKey());
	            data.add(entry.getValue());
	            result.add(data);
	        }
	        
	        return result;
	    }
	 
		/*
		 * Given an array nums of n integers, find the most frequent element in it i.e.,
		 * the element that occurs the maximum number of times. If there are multiple
		 * elements that appear a maximum number of times, find the smallest of them.
		 */
	 
	 	public static int mostFrequentElement(int[] nums) {
	     
	 		Map<Integer, Integer> map = new LinkedHashMap<>();
	 		for(int i:nums) {
	 			if(map.containsKey(i))map.put(i,map.get(i)+1);
	 			else {
	 				map.put(i, 0);
	 			}
	 		}
	 		
	 		int max=0;
	 		int maxValue=0;
	 		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
	 			if( entry.getValue()>max) {
	 				max=entry.getValue();
	 				maxValue=entry.getKey();
	 			}
	 		}
	 		return maxValue;
	    }
	
	public static void main(String[] args) {
		int[] nums= {2, 2, 2, 1, 3,1,1};
//		List<List<Integer>> countFrequencies = countFrequencies(nums);
//		System.out.println(countFrequencies);
		
		int maxFrequency = mostFrequentElement(nums);
		System.out.println(maxFrequency);
		
	}
}
