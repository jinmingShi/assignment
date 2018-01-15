package week2;

import java.util.*;
//Print all combinations from string in forward order.

public class Question5 {
	public static void main(String...args) {
		int[] array = new int[]{11, 4, 13, 20, 32, 44, 59, 61, 71, 75, 86, 88};
		//int[] array = new int[]{3, 1, 2, 3, 4};
		System.out.println(count(array, 567601));
	}
	
	public static void print(String input) {
		if (input == null || input.length() == 0) {
			return;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			sb.append(input.charAt(i));
			System.out.println(sb.toString());
		}
	}
	
	static long count(int[] array, int k) {
	  long[] product = new long[array.length + 1];
	  product[0] = 1;
	  for (int i = 1; i < product.length; i++) {
	  	product[i] = product[i - 1] * array[i - 1];
	  }
	  long res = 0;
	  for (int i = 1; i < product.length; i++) {
	  	for (int j = 0; j < i; j++) {
	  		if (product[i] < k * product[j]) {
	  			res++;
	  		}
	  	}
	  }
	  return res;
	}
	
	public static void findSubArray(int[] array, int k) {
		if (array == null || array.length == 0) {
			return;
		}
		int number = 0;
		for (int i = 1; i < array.length - 1; i++) {
			int index  = i;
			long sum = 1;
			while (index < array.length - 1) {
				sum *= array[index];
				if (sum < k) {
					number++;
				} else {
					break;
				}
				index++;
			}
		}
		System.out.print(number);
	}
	
	
	
	public static int count = 0;
	private static void helper(int[] array, ArrayList<Integer> list, int index, int left, int right, int k) {
		if (index == right) {
			if (list.size() > 0 && list.size() < right - left) {
				int sum = 1;
				for (int i : list) {
					//System.out.print(i + " ");
					sum *= i;
				}
				//System.out.println();
				if (sum < k) {
					count++;
				}
			}
			return;
		}
		helper(array, list, index + 1, left, right, k);
		list.add(array[index]);
		helper(array, list, index + 1, left, right, k);
		list.remove(list.size() - 1);
	}
}
