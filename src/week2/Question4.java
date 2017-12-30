package week2;
import java.util.*;

//Print out the all the nodes of binary search tree in reverse sequence

public class Question4 {
	public static void main(String[] args) {
		
	}
	
	public static void reverBST(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> stack = new LinkedList<>();
		while (root != null || stack.isEmpty()) {
			if (root != null) {
				stack.offerFirst(root);
				root = root.left;
			} else {
				TreeNode cur = stack.pollFirst();
				System.out.print(cur.val + " ");
				root = cur.right;
			}
		}
	}
}
