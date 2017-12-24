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
		q.partition("aab");
	}
	public List<List<String>> partition(String input) {
		List<List<String>> res = new ArrayList<>();
		List<String> subRes = new ArrayList<>();
		dfs(input, 0, res, subRes);
		for (List<String> list : res) {
			for (String s : list) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		return res;
	}

	private void dfs(String s, int level, List<List<String>> res, List<String> subRes) {
		if (level == s.length()) {
			res.add(new ArrayList<>(subRes));
			return;
		}
		for (int i = level; i < s.length(); i++) {
			if (isPal(s, level, i)) {
				subRes.add(s.substring(level, i + 1));
				dfs(s, i + 1, res, subRes);
				subRes.remove(subRes.size() - 1);
			}
		}
	}

	private boolean isPal(String s, int left, int right) {
		if (left == right) {
			return true;
		}
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
