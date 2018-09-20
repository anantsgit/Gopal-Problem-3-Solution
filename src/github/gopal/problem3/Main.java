/**
 * 
 */
package github.gopal.problem3;

import java.util.Arrays;

import github.gopal.problem3.solution.Solve;
import github.gopal.problem3.util.InputDataCreator;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Character[] inputData = InputDataCreator.getInputData();
		System.out.println(Arrays.toString(inputData));

		Solve.reverseCompleteWords(inputData);

		System.out.println(Arrays.toString(inputData));
	}

}
