package week2;
import java.util.*;

//Given int[] array,return number with sum target for example {1,2,7,8,9},target is 9,return(1,8),(2,7)

public class Question2 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 7, 8, 9};
		sum(a, 9);
	}
	
	public static List<int[]> sum(int[] array, int target) {
		List<int[]> list = new ArrayList<>();
		if (array == null || array.length <= 1) {
			return list;
		}
		Set<Integer> set = new HashSet<>();
		for (int i : array) {
			set.add(i);
		}
		for (int i : array) {
			if (set.contains(target - i)) {
				list.add(new int[]{i, target - i});
				set.remove(i);
				System.out.println(target - i + " " + i );
			}
		}
		return list;
	}
}
