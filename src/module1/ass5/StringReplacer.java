package module1.ass5;

public class StringReplacer {

	/**
	 * @author sunil_patil
	 */
	public static void main(String[] args) {

		String sourceStr = "This is just string";
		String strToReplace = "just";
		String replacedString = "another";

		sourceStr = replaceString(sourceStr, strToReplace, replacedString);

		System.out.println(sourceStr);

	}

	private static String replaceString(String sourceStr, String strToReplace,
			String replacedString) {

		return sourceStr.replace(strToReplace, replacedString);

	}

}
