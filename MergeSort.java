
public class MergeSort {

	public static void main(String[] args) {
		int array[] = {7, 9, 1, 5, 6, 4}; // initial array value
		
		System.out.print("Before merge sort: ");
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		System.out.println("\nSorting...");
		array = mergeSort(array);
		
		System.out.print("After merge sort: ");
		for(int a : array) {
			System.out.print(a + " ");
		}

	}
	
	public static int[] mergeSort(int[] array) {
		int n = array.length; // total array length
		
		// return array if there is only one or zero elements
		if(n <= 1) return array;
		
		int middleNumber = n/2; // the middle number of the array
		
		int[] leftArray = new int[middleNumber]; // declare of left array
		int[] rightArray;
		// check if odd number of array, plus one array length
		if(n%2 != 0) {
			rightArray = new int[middleNumber+1];
		}
		else {
			rightArray = new int[middleNumber];
		}
		
		System.out.print("The left array: ");
		// stored the leftArray from array
		for(int i=0; i<middleNumber; i++) {
			leftArray[i] = array[i];
			System.out.print(leftArray[i] + " ");
		}
		
		System.out.print("\nThe right array: ");
		// stored the rightArray from array
		for(int i=middleNumber; i<n; i++) {
			rightArray[i-middleNumber] = array[i];
			System.out.print(rightArray[i-middleNumber] + " ");
		}
		
		System.out.println();
		return array;
	}

}
