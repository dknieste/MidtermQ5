import java.util.Scanner;

public class LuhnAlgorithm {

	// method that runs the actual algorithm
	public static boolean runLuhnAlgorithm(String creditCardNumber) {

		// declaring all sums now
		int sumOfEvenDigits = 0;
		int sumOfOddDigits = 0;
		int addingDigit = 0;

		// summing up the indices that must be doubled
		for (int i = creditCardNumber.length() - 2; i >= 0; i -= 2) {
			int currentNumber = Character.getNumericValue(creditCardNumber
					.charAt(i));
			addingDigit = currentNumber * 2;

			// if the digit * 2 is between 10 and 18 inclusive, we add
			// 1 + the ones place digit
			if (addingDigit >= 10) {
				addingDigit = addingDigit % 10 + 1;
			}
			sumOfEvenDigits += addingDigit;
		}

		// sum up all the other numbers
		for (int i = creditCardNumber.length() - 1; i >= 0; i -= 2) {
			int currentNumber = Character.getNumericValue(creditCardNumber
					.charAt(i));
			sumOfOddDigits += currentNumber;
		}

		// check that the sum of even + odds mod 10 is zero
		if ((sumOfEvenDigits + sumOfOddDigits) % 10 == 0)
			return true;
		else
			return false;

	}

	
	// main method that prompts the user and prints statements
	public static void main(String[] args) {

		System.out
				.println("Please input the credit card number without spaces: ");
		Scanner scan = new Scanner(System.in);
		String creditCardNumber = scan.nextLine();

		boolean ans = runLuhnAlgorithm(creditCardNumber);
		if (ans == true) {
			System.out.println("This card is valid");
		} else {
			System.out.println("Sorry, this card is invalid");
		}
	}
}