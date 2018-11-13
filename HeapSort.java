
public class HeapSort {

	public static void main(String[] args) {
		int array[] = {12, 9, 13, 5, 6}; // initial array value
		
		System.out.println("Before heap sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}
		
		System.out.println("\nSorting...");
		//array = insertSort(array);
		
		System.out.println("After heap sort:");
		for(int a : array) {
			System.out.print(a + " ");
		}
	}

}
