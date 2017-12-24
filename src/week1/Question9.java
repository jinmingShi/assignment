package week1;

import java.util.*;

//"""Given a string s, partition s such that every substring of the partition is a palindrome.
//Return all possible palindrome partitioning of s.
//For example, given s = """"aab"""",
//Return
//  [
//    [""""aa"""",""""b""""],
//    [""""a"""",""""a"""",""""b""""]
//  ]"""


public class Question9 {
	public static void main(String[] args) {
		Question9 q = new Question9();
		String input = "aba";
		q.palindrome(input);
	}
	
	public void palindrome(String input) {
		if (input == null || input.length() <= 1) {
			return;
		}
		List<String> result = new ArrayList<String>();
		int length = input.length();
		int[][] table = new int[length][length];
	 
		// l is length, i is index of left boundary, j is index of right boundary
		for (int l = 1; l <= length; l++) {
			for (int i = 0; i <= length - l; i++) {
				int j = i + l - 1;
				if (input.charAt(i) == input.charAt(j)) {
					if (l == 1 || l == 2) {
						table[i][j] = 1;
					} else {
						table[i][j] = table[i + 1][j - 1];
					}
					if (table[i][j] == 1) {
						result.add(input.substring(i, j + 1));
					}
				} else {
					table[i][j] = 0;
				}
			}
		}
		for (String s : result) {
			System.out.println(s);
		}
	}
}

