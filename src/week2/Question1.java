package week2;

import java.util.*;

//Given int[] array return number appear twice

public class Question1 {
	public static void main(String...args) {
		int[] a = new int[]{1, 2, 3, 4, 4, 1, 3, 5};
		find(a);
	}
	
	public static List<Integer> find(int[] array) {
		List<Integer> list = new ArrayList<>();
		if (array == null || array.length <= 1) {
			return list;
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			Integer cur = map.get(i);
			if (cur == null) {
				map.put(i, 1);
			} else {
				map.put(i, cur + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.print(entry.getKey() + " ");
				list.add(entry.getKey());
			}
		}
		return list;
	}
}
