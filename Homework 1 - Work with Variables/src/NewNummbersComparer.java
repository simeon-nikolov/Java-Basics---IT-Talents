import java.util.Locale;
import java.util.Scanner;

//Задача 8:
//Да се състави програма, която чете от конзолата 4-цифренo
//естествено число от интервала [1000.. 9999]. От това число се
//формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
//и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
//3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
//ново число e по-малко <, равно = или по-голямо от 2-то число.
//Пример: 3332 Изход: по-малко (32<33)
//Пример: 1144 Изход: равни (14=14)
//Пример: 9875 Изход: по-голямо (95>87)

public class NewNummbersComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.print("Please enter a 4 digit number: ");
		int number = consoleInput.nextInt();

		int firstNumber = 10 * (number / 1000) + (number % 10);
		int secondNumber = 10 * ((number % 1000) / 100) + ((number % 100) / 10);

		if (firstNumber < secondNumber) {
			System.out.println("по-малко (" + firstNumber + "<" + secondNumber + ")");
		} else {
			if (firstNumber > secondNumber) {
				System.out.println("по-голямо (" + firstNumber + ">" + secondNumber + ")");
			} else {
				System.out.println("равни (" + firstNumber + "=" + secondNumber + ")");
			}
		}

		consoleInput.close();
	}

}
