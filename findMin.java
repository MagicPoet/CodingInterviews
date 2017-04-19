package algorithm;

public class findMin {
	public static int findMin(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		int middle = 0;
		while(arr[low] > arr[high]) {
			if(high - low == 1) {
				middle = high;
				break;
			} 
			middle = (low + high)/2;
			if(arr[middle] >= arr[low]) {
				low = middle;
			} else if(arr[middle] <= arr[high]) {
				high = middle;
			}			
			
		}
		return arr[middle];
	}
	
	public static void main(String args[]) {
		 int test[] = { 3, 4, 5, 1, 2 };
		 System.out.println(findMin(test));
	}
}
