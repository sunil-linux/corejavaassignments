package module1.ass8;

import java.util.Scanner;

public class XOWinner {

	/**
	 * @author sunil_patil
	 */
	public static void main(String[] args) {

		char[][] data = new char[3][3];

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Enter Char Data ( x or o) : ");
			for (int i = 0; i < 3; i++) {

				System.out.println("Enter for Row :" + (i + 1));
				for (int j = 0; j < 3; j++) {

					String ch = scanner.next();

					if (ch.equals("o") || ch.equals("x"))
						data[i][j] = ch.charAt(0);
					else
						System.out.println("Not Valid Character. Please Enter o or x.");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (scanner != null)
				scanner.close();
		}

		// Display the matrix
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}

		
		char owner = findOwner(data);

		System.out.println("Owner is:" + owner);

	}

	// find the owner and return it.
	private static char findOwner(char[][] data) {

		char[] owners = { 'o', 'x' };

		for (int i = 0; i < owners.length; i++) {

			boolean result1 = checkDiagonals(data, owners[i]);

			boolean result2 = checkRows(data, owners[i]);

			boolean result3 = checkColumns(data, owners[i]);

			if (result1 || result2 || result3)
				return owners[i];
		}

		return 0;
	}

	private static boolean checkColumns(char[][] data, char c) {
		boolean flag = false;

		for (int i = 0; i < 3; i++) {

			if (((data[0][i] == c) && (data[1][i] == c) && (data[2][i] == c))) {

				flag = true;
			}

		}

		return flag;

	}

	private static boolean checkRows(char[][] data, char c) {

		boolean flag = false;

		for (int i = 0; i < 3; i++) {

			if (((data[i][0] == c) && (data[i][1] == c) && (data[i][2] == c))) {

				flag = true;
			}

		}

		return flag;
	}

	private static boolean checkDiagonals(char[][] data, char c) {

		boolean flag = true;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				if (i == j) {
					if (!(data[i][j] == c && data[j][i] == c)) {
						flag = false;
					}
				}
			}

		}

		return flag;
	}

}
