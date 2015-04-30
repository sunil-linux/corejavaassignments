package module1.ass3;

public class ElementFinder {

	/**
	 * @author sunil_patil
	 */
	public static void main(String[] args) {

		int arr[] = { 10, 60, 4, 5, 1, 57, 23, 45, 67, 90, 77, 11 };
		int element = 77;

		int pos = findPosition(arr, element);
		
		if (pos != -1)
			System.out.println("Element "+element + " Found at " + pos +" Position.");
		else
			System.out.println("Element "+element+" not found");
	}

	static int findPosition(int[] arr, int element) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element)
				return i;
		}
		return -1;
	}

}
