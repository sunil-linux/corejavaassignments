package module1.ass1;

/**
 *
 * @author sunil_patil
 */
public class StringChecker {

	/**
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		String sentence = "This is Very beautiful world having beautiful thoughts";
		String word = "beautiful";

		int wordMatchCount = check(sentence, word);

		System.out.println("No of Occurences :" + wordMatchCount);

	}

	
	/**
	 * Check the the word in sentence
	 *
	 * @param sentence the sentence
	 * @param word the word
	 * @return count no of occurrences of given word in sentence
	 */
	private static int check(String sentence, String word) {

		if (isEmpty(sentence) || isEmpty(word))
			return -1;

		int count = 0;
		int index = 0;

		while ((index = sentence.indexOf(word, index)) != -1) {
			index += word.length();
			count++;
		}
		
		return count;

	}

	/**
	 * Checks if the given  string empty or not
	 *
	 * @param str the str to be check
	 * @return true, if it is empty
	 * @return false, if it is not empty
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

}
