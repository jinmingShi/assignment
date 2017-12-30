package week2;

import java.util.*;
//Print all combinations from string in forward order.

public class Question5 {
	public static void main(String...args) {
		print("jimmy");
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
}
