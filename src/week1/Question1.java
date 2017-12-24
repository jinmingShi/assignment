package week1;

public class Question1 {
	//"Rotate an array of n elements to the right by k steps. 
	//For example, with n = 7 and k = 3, 
	//the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]."
	public static void main(String[] args) {
		Question1 q = new Question1();
		int[] array = {1,2,3,4,5,6,7};
		q.rotate(array, 3);
	}
	
	public int[] rotate(int[] array, int k) {
		if (array == null || array.length == 0 || k <= 0) {
			return new int[0];
		}
		int flag = k;
		int[] res = new int[array.length];
		k = k % array.length;
		int index = array.length - 1;
		while (k > 0) {
			System.out.println(k);
			res[--k] = array[index--];
		}
		for (int i = 0; i <= index; i++) {
			res[flag++] = array[i];
		}
		for (int i : res) {
			System.out.print(i + " ");
		}
		return res;
	}
}
