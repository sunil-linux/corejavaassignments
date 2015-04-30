package module1.ass4;

/**
 * 
 * @author sunil_patil
 *
 */
public class StringReverser {
	
	public static void main(String[] args) {

		String str = "To be or not to be";
		str = reverseString(str);
		System.out.println(str);

	}

	//called from reverseString() to return the reversed string.
	private static String makeReverse(String str) {
		
		if (str != null && str.length() > 0) {
			StringBuilder sb = new StringBuilder(str);
			return sb.reverse().toString();
		}
		return null;
	}

	//It will use makeReverse for each word in the given string and append to the actual final string.
	private static String reverseString(String str) {

		StringBuilder sb = new StringBuilder();

		String[] strs = str.split(" ");

		for (String s : strs) {		
			sb.append(makeReverse(s)+" ");
		}
		return sb.toString();		
	}

}
