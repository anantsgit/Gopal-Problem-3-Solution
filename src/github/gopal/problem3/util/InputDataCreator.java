/**
 * 
 */
package github.gopal.problem3.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gopal
 *
 */
public class InputDataCreator {

	private InputDataCreator() {
		// NOOP
	}

	private static final String INPUT_STRING = "the lazy dog jumped the gun";
	
	public static Character[] getInputData() {
		List<Character> charList = new ArrayList<Character>();
		String[] splittedStrings = INPUT_STRING.split(" ");
		for (String splittedString : splittedStrings) {
			char[] charArray = splittedString.toCharArray();
			for (char character : charArray) {
				charList.add(character);
			}
			charList.add(' ');
		}
		charList.remove((charList.size() - 1));
		Character[] charArray = charList.toArray(new Character[charList.size()]);
		return charArray;
	}

}
