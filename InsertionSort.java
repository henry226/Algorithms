
public class InsertionSort {
	// Main class
	public static void main(String[] args) {
		int array[] = {12, 9, 13, 5, 6}; // initial array value
		
		System.out.println("Before insertion sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		System.out.println("\nSorting...");
		array = insertSort(array);
		
		System.out.println("After insertion sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}
	}
	
	// Implment insert sort here
	public static int[] insertSort(int[] array) {
		int n = array.length;
		
		for(int i=1; i<n; i++) {
			int key = i-1; // key is previous index of array[i]
			int index = i; // index is the current array[i]
			
			while(array[key] > array[index] && key>=0){
				// swap array between index and key
				int temp = array[index];
				array[index] = array[key];
				array[key] = temp;
				System.out.println("array[" + key + "]: " + array[key] + " <=> array[" + index + "]: " + array[index]);
				
				// Doing this to avoid array out of bounce error ( when key = -1)
				if(key != 0) {
					key--;
				}
				index--;
			}
		}
		return array;
	}
}
