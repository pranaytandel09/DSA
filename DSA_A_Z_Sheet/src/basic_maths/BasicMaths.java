package basic_maths;

import java.util.ArrayList;
import java.util.List;

public class BasicMaths {

	//count the digits of numbers
	private static int countDigits(int n) {
		//approach first
//		int count=0;
//		while(n>0) {
//			count++;
//			n=n/10;
//		}
//		return count;
		
		//approach 2nd
		return (int) (Math.log10(n) + 1);
	}
	
	/*
	 * reverse the number eg. 1213 --> 3121
	 */
	public static int reverse(int x) {
		
		long sum=0;
		while(x!=0) {
			sum = sum*10 + x%10;
			x=x/10;
		}
		
		return (sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)? 0:(int)sum;
	}
	
	/*
	 * check wether given number is palindrome or not eg. 121 --> 121 palindrom 1223
	 * --> 3221 not a palindrome
	 */
	public static boolean palindrome(int x) {
		
		if(x<0)return false;
		int reverse=0;
		int xcopy=x;
		
		while(x>0) {
			reverse= reverse*10 + x%10;
			x=x/10;
		}
		
		return reverse==xcopy;
		
	}
	
	/*
	 * The Greatest Common Divisor of any two integers is the largest number that
	 * divides both integers. Input:N1 = 9, N2 = 12
	 * Output:3 Explanation:Factors of 9: 1, 3 and 9 Factors of 12: 1, 2, 3, 4, 6,
	 * 12 Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
	 */
	public static int gcdOrHcf(int a, int b) {
		
		//1. brute force 
//		int result=0;
//		for(int i=1; i<= Math.min(a, b); i++) {
//			
//			if(a%i==0 & b%i==0) {
//				result=i;
//			}
//		}
//		return result;
		
		//2. optimal solution
		
		/*
		 * The Euclidean Algorithm is a method for finding the greatest common divisor
		 * of two numbers. It operates on the principle that the GCD of two numbers
		 * remains the same even if the smaller number is subtracted from the larger
		 * number.
		 * To find the GCD of n1 and n2 where n1 > n2:
		 * Repeatedly subtract the smaller number from the larger number until one of
		 * them becomes 0. Once one of them becomes 0, the other number is the GCD of
		 * the original numbers. Eg, n1 = 20, n2 = 15:
		 * 
		 * gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
		 * 
		 * gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
		 * 
		 * gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
		 * 
		 * gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)
		 * 
		 * Hence, return 5 as the gcd.
		 */
		
		while(a>0 && b>0) {
			
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		return (a==0)?b:a; 
		
	}
	
	/*
	 * You are given an integer n. You need to check whether it is an armstrong
	 * number or not. Return true if it is an armstrong number, otherwise return
	 * false. An armstrong number is a number which is equal to the sum of the
	 * digits of the number, raised to the power of the number of digits.
	 * Input: n = 153
	 * Output: true
	 * Explanation: Number of digits : 3.
	 * 13 + 53 + 33 = 1 + 125 + 27 = 153.
	 * Therefore, it is an Armstrong number.
	 */
	public static boolean armstrong(int x) {
		
		int length = String.valueOf(x).length();
		
		int num=x;
		int sum=0;
		while(num>0) {
			int ld= num%10;
			sum+= Math.pow(ld, length);
			num=num/10;
		}
		
		return sum==x? true: false;
		
	}
	
	/*
	 * Given an integer N, return all divisors of N. A divisor of an integer N is a
	 * positive integer that divides N without leaving a remainder. In other words,
	 * if N is divisible by another integer without any remainder, then that integer
	 * is considered a divisor of N.
	 */
	public static List<Integer> printAllDevisors(int n) {
		
		List<Integer> result= new ArrayList<>();
		
		for(int i=1; i*i<= n ; i++) {
			
			if(n%i==0) {
				result.add(i);
				
				if(i!= n/i) {
					result.add(n/i);
				}
			}
			
			
		}
		return result;
		
	}
	
	public static boolean primeNumber(int n) {
		
		List<Integer> result= new ArrayList<>();
		
		for(int i=1; i*i<= n ; i++) {
			
			if(n%i==0) {
				result.add(i);
				
				if(i!= n/i) {
					result.add(n/i);
				}
			}
			
			
		}
		return result.size()==2;
		
	}
	
	
	public static void main(String[] args) {
		
//		int result = countDigits(4);
//		int result = reverse(1534236469);
//		boolean result = palindrome(1212);
		//int result = gcdOrHcf(9,12);
//		boolean result = armstrong(153);
		
//		List<Integer> printAllDevisors = printAllDevisors(36);
//		printAllDevisors.stream().forEach(i-> System.out.println(i+","));
		
		boolean result = primeNumber(13);
		System.out.println(result);
		
	}
}
