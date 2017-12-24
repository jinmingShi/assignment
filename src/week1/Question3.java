package week1;

import java.util.ArrayList;
import java.util.List;

//"""Given a matrix of m x n elements (m rows, n columns), return all elements of 
//the matrix in spiral order.
//For example, given the following matrix:
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//You should return [1,2,3,6,9,8,7,4,5]."""

public class Question3 {
	public static void main(String[] args) {
		Question3 q = new Question3();
		int[][] array = {{ 1, 2, 3}, { 4, 5, 6 },{ 7, 8, 9 }};
		q.spiralOrder(array);
	}
	
	public List<Integer> spiralOrder(int[][] array) {
		List<Integer> res = new ArrayList<>();
		if (array == null || array.length == 0) {
			return res;
		}
		int m = array.length;
		int n = array[0].length;
		int up = 0;
		int down = m - 1;
		int left = 0;
		int right = n - 1;
		while (up < down && left < right) {
			for (int i = left; i < right; i++) {
				res.add(array[up][i]);
			}
			for (int i = up; i < down; i++) {
				res.add(array[i][right]);
			}
			for (int i = right; i > left; i--) {
				res.add(array[down][i]);
			}
			for (int i = down; i > up; i--) {
				res.add(array[i][left]);
			}
			up++;
			left++;
			right--;
			down--;
		}
		if (left > right && up > down) {
			return res;
		}
		if (left == right) {
			for (int i = up; i <= down; i++) {
				res.add(array[left][i]);
			}
		} else if (up == down) {
			for (int i = left; i <= right; i++) {
				res.add(array[up][i]);
			}
		}
		for (int i : res) {
			System.out.print(i + " ");
		}
		return res;
	}
}


