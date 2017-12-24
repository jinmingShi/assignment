package week1;

//"Given numRows, generate the first numRows of Pascal's triangle.
//For example, given numRows = 5, the result should be:
//[
//    [1],
//   [1,1],
//  [1,2,1],
// [1,3,3,1],
//[1,4,6,4,1]
//]"

public class Question2 {
	public static void main(String[] args) {
		Question2 q = new Question2();
		q.pascalTriangle(5);
	}
	
	public void pascalTriangle(int n) {
		if (n <= 0) {
			return;
		}
		int[][] res = new int[n][n];
		for (int i = 0; i < n; i++) {
			int[] array = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					array[j] = 1;
				} else {
					array[j] = res[i - 1][j - 1] + res[i - 1][j];
				}
			}
			res[i] = array;
		}
		for (int[] a : res) {
			for (int i : a) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
