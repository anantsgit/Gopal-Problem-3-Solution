/**
 * 
 */
package github.gopal.problem3.solution;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static void reverseCompleteWords(Character[] input) {
		reverseArraySegment(input, 0, (input.length - 1));
		reverseWordsIndividuallyForward(input);
		//reverseWordsIndividuallyReverse(input);
	}

	private static void reverseWordsIndividuallyForward(Character[] inputCharacters) {
		int startIndex = 0;
		int lastSpaceIndex = 0;
		for (int i = 0; i < inputCharacters.length; i++) {
			Character currentCharacter = inputCharacters[i];
			if (currentCharacter.equals(' ')) {
				lastSpaceIndex = i;
				reverseArraySegment(inputCharacters, startIndex, (i - 1));
				startIndex = (i + 1);
			}
		}
		reverseArraySegment(inputCharacters, lastSpaceIndex + 1, (inputCharacters.length - 1));
	}

	private static void reverseWordsIndividuallyReverse(Character[] inputCharacters) {
		int endIndex = inputCharacters.length - 1;
		int lastSpaceIndex = 0;
		for (int i = inputCharacters.length - 1; i >= 0; i--) {
			Character currentCharacter = inputCharacters[i];
			if (currentCharacter.equals(' ')) {
				lastSpaceIndex = i;
				reverseArraySegment(inputCharacters, (i + 1), endIndex);
				endIndex = (i - 1);
			}
		}
		reverseArraySegment(inputCharacters, 0, (lastSpaceIndex - 1));
	}

	private static void reverseArraySegment(Character[] input, int startIndex, int endIndex) {
		int arrayLength = (endIndex - startIndex) + 1;
		boolean isEvenLength = ((arrayLength % 2) == 0);

		// Even Case :      0 1 2 3 4 5         backwardIndex : 2 , forwardIndex : 3
		// Odd Case  :      0 1 2 3 4 5 6       backwardIndex : 2 , forwardIndex : 4

		int backwardIndex =  (arrayLength / 2) - 1;
		backwardIndex += startIndex;
		
		int forwardIndex = isEvenLength ? ((arrayLength / 2)) : ((arrayLength / 2) + 1);
		forwardIndex += startIndex;

		while (backwardIndex >= startIndex) {
			Character temp = input[backwardIndex];
			input[backwardIndex] = input[forwardIndex];
			input[forwardIndex] = temp;
			forwardIndex++;
			backwardIndex--;
		}
	}

}
