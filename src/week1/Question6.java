package week1;

import java.util.*;

//"""Given a collection of intervals, merge all overlapping intervals.
//For example,
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18]."""

public class Question6 implements Comparator<int[]> {
	public static void main(String[] args) {
		Question6 q = new Question6();
		List<int[]> list = new ArrayList<>();
		int[] a = {1, 3};
		list.add(a);
		a = new int[]{2, 6};
		list.add(a);
		a = new int[]{8, 10};
		list.add(a);
		a = new int[]{15, 18};
		list.add(a);
		q.merge(list);
	}
	
	public void merge(List<int[]> list) {
		if (list == null || list.size() == 0 || list.size() == 1) {
			return;
		}
		List<int[]> res = new ArrayList<>();
		Collections.sort(list, this);
		res.add(list.get(0));
		int end = list.get(0)[1];
		for (int i = 1; i < list.size(); i++) {
			int[] cur = list.get(i);
			if (end >= cur[0]) {
				end = cur[1];
				res.get(res.size() - 1)[1] = end;
			} else {
				res.add(cur);
				end = cur[1];
			}
		}
		for (int[] a : res) {
			for (int i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	@Override
	public int compare(int[] a, int[] b) {
		return a[0] - b[0];
	}
}
