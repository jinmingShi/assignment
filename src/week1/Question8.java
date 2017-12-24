package week1;

import java.util.*;

//"""Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
//For example, given n = 4,
//[
//[1,   2,  3, 4], 
//[12, 13, 14, 5], 
//[11, 16, 15, 6], 
//[10,  9,  8, 7]
//]"""

public class Question8 {
	public static void main(String[] args) {
		Question8 q = new Question8();
		q.spiral(3);
	}
	public void spiral(int n) {
		if (n <= 0) {
			return;
		}
		int[][] matrix = new int[n][n];
		helper(matrix, 0, n, 0);
	}
	
	private void helper(int[][] matrix, int offset, int size, int m) {
		if (size == 0) {
			return;
		}
		if (size == 1) {
			matrix[offset][offset] = m;
			return;
		}
		
		for (int i = 0; i < size - 1; i++) {
			matrix[offset][offset + 1] = m++;
		}
		for (int i = 0; i < size - 1; i++) {
			matrix[offset + i][size - 1 + offset] = m++;
		}
		for (int i = size - 1; i > 0; i--) {
			matrix[size - 1 + offset][i + offset] = m++;
		}
		for (int i = size - 1; i > 0; i--) {
			matrix[i + offset][offset] = m++;
		}
		helper(matrix, offset + 1, size - 2, m); 
	}
}
