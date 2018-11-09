
public class MergeSort {

	public static void main(String[] args) {
		int array[] = {7, 9, 1, 5, 6, 4}; // initial array value
		
		System.out.println("Before merge sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		System.out.println("\nSorting...");
		//array = insertSort(array);
		
		System.out.println("After merge sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}

	}

}
