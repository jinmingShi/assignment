package week2;
import java.util.*;

//Print binary tree in level order

public class Question3 {
	public static void main(String[] args) {
		
	}
	
	public static void levelOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		Deque<TreeNode> queue = new ArrayDeque<>();
		queue.offer(root);
		while (queue.size() != 0) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = queue.poll();
				if (cur.left != null) {
					queue.offer(cur.left);
				}
				if (cur.right != null) {
					queue.offer(cur.right);
				}
				System.out.print(cur.val + " ");
			}
		}
	}
}

class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	
	TreeNode(int val) {
		this.val = val;
	}
}