
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
		
		System.out.print("The right array: ");
		// stored the rightArray from array
		for(int i=middleNumber; i<n; i++) {
			rightArray[i-middleNumber] = array[i];
			System.out.print(rightArray[i-middleNumber] + " ");
		}
		System.out.println("");
		
		int[] res = new int[array.length];
		
		// recrusive call mergeSort method
		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);
		
		// Do the merge(swap) operation here
		res = merge(leftArray, rightArray);
		
		return res;
	}
	
	public static int[] merge(int[] leftArray, int[] rightArray) {
		// left, right, result pointers
		int left, right, res;
		left = right = res = 0;
		// left, right array length
		int leftLength = leftArray.length;
		int rightLength = rightArray.length;
		
		int[] result = new int[leftLength + rightLength];
		
		// Make sure there are at least one element in left or right array
		while(left < leftLength || right < rightLength) {
			// If there are elements in both left and right array
			if(left < leftLength && right < rightLength) {
				// if left is greater, store in result
				if(leftArray[left] < rightArray[right]) {
					result[res++] = leftArray[left++];
				}
				// if right is greater, store in result
				else {
					result[res++] = rightArray[right++];
				}
			} 
			// if there are only items in left array
			else if(left < leftLength) {
				result[res++] = leftArray[left++];
			}
			// if there are only items in right array
			else if(right < rightLength) {
				result[res++] = rightArray[right++];
			}
			
		}
		// Outoupt the operation
		System.out.print("Result: ");
		for(int r : result) {
			System.out.print(r + " ");
		}
		System.out.println();
		
		return result;
	}

}
