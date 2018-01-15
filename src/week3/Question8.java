package week3;

//Find height of a Binary Search Tree (BST)
import java.util.*;

public class Question8 {
	public static void main(String[] args) {
		TreeNode root = insert(null, 4);
    insert(root, 2);
    insert(root, 1);
    insert(root, 3);
    insert(root, 6);
    insert(root, 5);
    treeHeight(root);
	}
	
	public static TreeNode insert(TreeNode node, int val) {
    if (node == null) {
    	return (new TreeNode(val));
    } else { 
      if (val <= node.val) {
      	node.left = insert(node.left, val);
      } else {
        node.right = insert(node.right, val);
      }
        return node;
    }
	}

	public static int treeHeight(TreeNode node) {
    if (node == null) {
    	System.out.println(0);
    	return 0;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.add(node);
    int height = 0;
    while (true) {
      int nodeCount = q.size();
      if (nodeCount == 0) {
      	System.out.println(height);
      	return height;
      }
      height++;
      while (nodeCount > 0) {
      	TreeNode newnode = q.peek();
        q.poll();
        if (newnode.left != null) {
        	q.offer(newnode.left);
        }
        if (newnode.right != null) {
          q.offer(newnode.right);
        }
        nodeCount--;
      }
    }
	}
}
