package week3;

//Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive. 
//For example, given the range [5, 7], you should return 4.
public class Question1 {
	public static void main(String[] args) {
		bitWiseAND(5, 7);
	}
	
	public static void bitWiseAND(int m, int n) {
		if (m < 0 || n < 0) {
			return;
		}
		while (m < n) {
			n = n & (n - 1);
		}
		System.out.println(n & m);
	}
}
