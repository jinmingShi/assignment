package week1;
import java.util.*;

//"""Given a collection of numbers, return all possible permutations.
//For example,
//[1,2,3] have the following permutations:
//[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1]."""

public class Question10 {
	public static void main(String[] args) {
		Question10 q = new Question10();
		q.permutation(new int[]{1, 2, 3});
	}
	public void permutation(int[] array) {
		List<int[]> res = new ArrayList<>();
		if (array == null || array.length == 0) {
			return;
		}
		helper(array, 0, res);
		System.out.println(res.size());
	}
	private void helper(int[] array, int index, List<int[]> list) {
		if (index == array.length) {
			for (int i : array) {
				System.out.print(i + " ");
			}
			System.out.println();
			list.add(array);
			return;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = index; i < array.length; i++) {
			if (!set.contains(array[i])) {
				set.add(array[i]);
				swap(array, i, index);
				helper(array, index + 1, list);
				swap(array, i, index);
			}
		}
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
