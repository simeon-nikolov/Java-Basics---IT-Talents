import java.util.Locale;
import java.util.Scanner;

//Задача 5: Да се въведат от потребителя 2 числа. И да се
//изведат на екрана всички числа от по-малкото до по-голямото.
//
//Въведете първото число:
//12
//Въведете второто число:
//15
//12 13 14 15

public class Task05_NumbersInInterval {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNumber = consoleInput.nextInt();
		System.out.println("Enter second number: ");
		int secondNumber = consoleInput.nextInt();
		int smaller = firstNumber;
		int bigger = secondNumber;
		
		if (firstNumber > secondNumber) {
			smaller = secondNumber;
			bigger = firstNumber;
		}
		
		for (int num = smaller; num <= bigger; num++) {
			System.out.print(num + " ");
		}
		
		consoleInput.close();

	}

}
