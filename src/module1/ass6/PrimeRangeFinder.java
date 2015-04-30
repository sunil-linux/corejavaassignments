package module1.ass6;

import java.util.Scanner;

/**
 * 
 * @author sunil_patil
 *
 */
public class PrimeRangeFinder {

	// It is used to just avoid the traversing of entire array. 
	static int noOfPrimes = 0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start and end for prime range:");

		int start = scan.nextInt();
		int end = scan.nextInt();

		int[] primeNumbers = findRangeOfPrimes(start, end);
		for (int i = 0; i < noOfPrimes; i++)
			System.out.print(primeNumbers[i] + " ");
		
		
		scan.close();

	}

	// find range of prime and return the array of prime numbers list.
	private static int[] findRangeOfPrimes(int start, int end) {

		int arr[] = new int[end - start];
		int index = 0;

		for (int i = start; i <= end; i++) {

			if (isPrime(i)) {
				noOfPrimes++;
				arr[index++] = i;
			}
		}
		return arr;
	}

	// Return true if given no is prime else false.
	private static boolean isPrime(int no) {

		if (no == 1)
			return true;

		for (int i = 2; i <= no / 2; i++) {
			if (no % i == 0)
				return false;
		}
		return true;
	}

}
