import java.util.Arrays;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class BinaryRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {12,15,8,5,14,21,26};
		int key = 15;
		
		Arrays.sort(numbers);
		
		int index =binarySearch(numbers , key,  0, numbers.length);
		
		System.out.println(key + ((index != -1 ) ? " is found in position " + (index+1) : "not found"));

//		System.out.println(key + " is found " + index);
}

	private static int binarySearch(int[] numbers, int key, int low , int high) {
		// TODO Auto-generated method stub
		
		int index = -1;
		if(high < low) {
			return -1;
		}
		int mid = (low + high)/2;
		
		if(key == numbers[mid]) {
			return mid;
		} else if (key < numbers[mid]) {
			return binarySearch(numbers , key , low , mid-1);
		} else {
			return binarySearch(numbers , key , mid+1 , high);
		}
	
	}

}
