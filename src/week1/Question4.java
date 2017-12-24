package week1;

import java.util.*;
//Write a method that will remove given character from the String
public class Question4 {
	public static void main(String[] args) {
		Question4 q = new Question4();
		String input = "abcd";
		String t = "cd";
		q.remove(input, t);
	}
	
	public void remove(String input, String t) {
		if (t == null || t.length() == 0) {
			return;
		}
		char[] array = input.toCharArray();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < t.length(); i++) {
			if (!set.contains(t.charAt(i))) {
				set.add(t.charAt(i));
			}
		}
		int slow = 0;
		for (int i = 0; i < array.length; i++) {
			if (!set.contains(array[i])) {
				array[slow++] = array[i];
			}
		}
		System.out.println(new String(array, 0, slow));
	}
}
