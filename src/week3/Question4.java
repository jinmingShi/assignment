package week3;

import java.util.*;

//"Given a collection of numbers, return all possible permutations.
//For example,
//[1,2,3] have the following permutations:
//[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1]."
public class Question4 {
	private static ArrayList<ArrayList<Integer>> permutate(int[] arr) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		for(int i=0;i<arr.length;i++) {
			ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> tmpList:result) {
				for(int index=0;index<tmpList.size()+1;index++) {
					tmpList.add(index,arr[i]);
					ArrayList<Integer> temp=new ArrayList<Integer>(tmpList);
					current.add(temp);
					tmpList.remove(index);
				}
			}
      result = new ArrayList<ArrayList<Integer>>(current);
		}
		return result;
	}
}
