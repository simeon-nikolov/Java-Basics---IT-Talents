import java.util.Locale;
import java.util.Scanner;


//Задача 9:
//Да се състави програма, която чете от конзолата 2 естествени
//двуцифрени числа a,b.
//Програмата да изведе в конзолата дали последната цифра от
//произведението на двете числа е четна, както и самата цифра.
//Входни данни: a,b - естествени числа от интервала [10..99].
//Пример: 15, 25
//Изход: 375, 5 нечетна

public class ParityChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.print("Enter a 2 digit number a: ");
		int firstNumber = consoleInput.nextInt();
		System.out.print("Enter a 2 digit number b: ");
		int secondNumber = consoleInput.nextInt();
		int product = firstNumber * secondNumber;
		int lastDigit = product % 10;
		System.out.print(product + ", " + lastDigit);
		
		if ((lastDigit % 2) == 0) {
			System.out.println(" even");
		} else {
			System.out.println(" odd");
		}
		
		consoleInput.close();

	}

}
