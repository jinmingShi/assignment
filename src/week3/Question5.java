package week3;

//"Find if there exists any pair of numbers which sum is equal to the value.
//For example,
//add(1); 
//add(3); 
//add(5);
//find(4) -> true
//find(7) -> false"

public class Question5 {
	public static void main(String[] args) {
		
	}
	
	public static boolean find(int[] array, int sum) {
		int count = 0;
    for (int i = 0; i < array.length; i++) {
    	for (int j = i + 1; j < array.length; j++) {
    		if ((array[i] + array[j]) == sum) {
    			count++;
        }
    	}
    }
    return count > 0 ? true:false;
	} 
}
