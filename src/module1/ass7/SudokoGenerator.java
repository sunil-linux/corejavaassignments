package module1.ass7;

/**
 * @author sunil_patil
 */
public class SudokoGenerator {

	static StringBuilder sb = new StringBuilder();

	// I got the all permutations but not able to convert into the sudoko. I tried
	// but it was not feasible solution so i skipped that.
	public static void main(String[] args) {

		String str = "123";

		findSudoko("", str);

		String[] data = sb.toString().split(" ");

		String[] first = new String[data.length / 2];
		String[] second = new String[data.length / 2];

		for (int i = 0, j = 0, k = 1; i < data.length; i += 2, k += 2) {
			first[j] = data[i];
			second[j] = data[k];
			j++;
		}

		for (int i = 0; i < data.length / 2; i++) {
			System.out.println(first[i]);
		}

		for (int i = 0; i < data.length / 2; i++) {
			System.out.println(second[i]);
		}

		// System.out.println(sb.toString());
	}

	// Using Recursion find the all permutations of given string
	private static void findSudoko(String begStr, String endStr) {

		if (endStr.length() <= 1) {

			sb.append(begStr + endStr + " ");

		} else {

			for (int i = 0; i < endStr.length(); i++) {
				String tempStr = endStr.substring(0, i)
						+ endStr.substring(i + 1);
				findSudoko(begStr + endStr.charAt(i), tempStr);
			}
		}

	}

}
