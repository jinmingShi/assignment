package week1;

import java.util.*;

//"Given a sorted array of integers, find the starting and ending position of 
//a given target value. 
//For example, given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4]."

public class Question5 {	
	public static void main(String[] args) {
		Question5 q = new Question5();
		int[] array = {5, 7, 7, 8, 8, 8,10};
		int target = 10;
		q.find(array, target);
	}
	
	public void find(int[] array, int target) {
		if (array == null || array.length == 0 || target < array[0] || target > array[array.length - 1]) {
			return;
		}
		int left = 0; 
		int right = array.length - 1;
		while (left + 1 < right) {
			int m = left + (right - left) / 2;
			if (array[m] == target) {
				right = m;
			} else if (array[m] > target) {
				right = m - 1;
			} else {
				left = m + 1;
			}
		}
		List<Integer> res = new ArrayList<>();
		for (int i = left; i < array.length; i++) {
			if (array[i] == target) {
				System.out.print(i + " ");
				res.add(i);
			}
		}
	}
}
