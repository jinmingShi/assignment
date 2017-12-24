package week1;

//"Given a set of non-overlapping & sorted intervals, insert a new interval into the 
//intervals (merge if necessary).
//for example:
//Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9]"
import java.util.*;

public class Question7 {
	public static void main(String[] args) {
		Question7 q = new Question7();
		List<int[]> list = new ArrayList<>();
		int[] a = {1, 3};
		list.add(a);
		a = new int[]{6, 9};
		list.add(a);
		int[] array = {2, 5};
		q.merge(list, array);
	}
	
	public void merge(List<int[]> list, int[] target)  {
		if (list == null || list.size() == 0 || target == null) {
			return;
		}
		int left = 0; 
		int right = list.size() - 1;
		while (left + 1 < right) {
			int m = left + (right - left) / 2;
			if (list.get(m)[0] >= target[0]) {
				right = m;
			} else if (list.get(m)[0] < target[0]) {
				left = m;
			}
		}
		if (list.get(left)[0] >= target[0]) {
			list.add(left, target);
			//System.out.println(left);
		} else {
			list.add(right, target);
			//System.out.println(right);
		}
		List<int[]> res = new ArrayList<>();
		
		res.add(list.get(0));
		right = res.get(0)[1];
		for (int i = 1; i < list.size(); i++) {
			int[] cur = list.get(i);
			if (right >= cur[0]) {
				right = cur[1];
				res.get(res.size() - 1)[1] = right;
			} else {
				res.add(cur);
				right = cur[1];
			}
		}
		for (int[] a : res) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
