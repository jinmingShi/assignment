package week3;

//Given an integer, write a function to determine if it is a power of two.
// 2 4 8 16 32
// 
public class Question2 {
	public static void main(String[] args) {
		
	}
	
	public static boolean isPowerOf2(int sum) {
		if (sum < 0) {
			return false;
		}
		while(sum > 2) {
			int t = sum >> 1;
      int c = t << 1;
      if (sum - c != 0) {
      	return false;
      }
      sum = sum >> 1;
   }
   return true;
	}
}
