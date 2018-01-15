package week3;

//Find min and max value from Binary Search Tree (BST)

public class Question7 {
	public static void minVal(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode pre = root;
		while (root != null) {
			pre = root;
			root = root.left;
		}
		System.out.println("min val: " + pre.val);
	}
	
	public static void maxVal(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode pre = root;
		while (root != null) {
			pre = root;
			root = root.right;
		}
		System.out.println("max val: " + pre.val);
	}
}

class TreeNode {
	int val;
	TreeNode left, right;
	
	TreeNode(int val) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}