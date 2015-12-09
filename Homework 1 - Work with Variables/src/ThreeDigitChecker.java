import java.util.Locale;
import java.util.Scanner;

//Задача 16:
//Въведено е трицифрено естествено число от вида abc.
//Трябва да се провери дали:
//ако a = b = c - Изход: цифрите са равни;
//ако a>b>c - Изход: цифрите са във възходящ ред;
//ако a<b<c цифрите са в низходящ ред;
//и изход: цифрите са ненаредени, за неописаните случаи.
//Да се състави програма, която извежда резултата от проверката за
//наредба на цифрите в числото.
//Пример: 345
//Изход: възходящ ред.

public class ThreeDigitChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = consoleInput.nextInt();
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;
		
		if ((firstDigit == secondDigit) && (firstDigit == thirdDigit)) {
			System.out.println("The digits are equal!");
		} else if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)) {
			System.out.println("The digits are in descending order!");
		} else if ((firstDigit < secondDigit) && (secondDigit < thirdDigit)) {
			System.out.println("The digits are in ascending order!");
		} else {
			System.out.println("The digits are unordered, TOTAL CHAOS!!!");
		}
		
		consoleInput.close();

	}

}
