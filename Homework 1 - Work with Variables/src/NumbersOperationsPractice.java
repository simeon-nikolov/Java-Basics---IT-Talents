import java.util.Locale;
import java.util.Scanner;

//Задача 2:
//Въведете 2 различни целочислени числа от конзолата. Запишете
//тяхната сума, разлика, произведение, остатък от деление и
//целочислено деление в отделни променливи и разпечатайте тези
//резултати в конзолата. Опитайте същото с числа с плаваща запетая.

public class NumbersOperationsPractice {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please input first integer number: ");
		int firstIntNumber = consoleInput.nextInt();
		System.out.println("Please input second integer number: ");
		int secondIntNumber = consoleInput.nextInt();

		int intSum = firstIntNumber + secondIntNumber;
		int intDiff = firstIntNumber - secondIntNumber;
		int intProduct = firstIntNumber * secondIntNumber;
		int intDiv = firstIntNumber / secondIntNumber;
		int intRemainder = firstIntNumber % secondIntNumber;

		System.out.println("Sum: " + intSum);
		System.out.println("Difference: " + intDiff);
		System.out.println("Product: " + intProduct);
		System.out.println("Ratio: " + intDiv);
		System.out.println("Remainder: " + intRemainder + "\n");

		System.out.println("Please input first floating point number: ");
		float firstFloatNumber = consoleInput.nextFloat();
		System.out.println("Please input second floating point number: ");
		float secindFloatNumber = consoleInput.nextFloat();

		float floatSum = firstFloatNumber + secindFloatNumber;
		float floatDiff = firstFloatNumber - secindFloatNumber;
		float floatProduct = firstFloatNumber * secindFloatNumber;
		float floatDiv = firstFloatNumber / secindFloatNumber;
		float floatRemainder = firstFloatNumber % secindFloatNumber;

		System.out.println("Sum: " + floatSum);
		System.out.println("Difference: " + floatDiff);
		System.out.println("Product: " + floatProduct);
		System.out.println("Ratio: " + floatDiv);
		System.out.println("Remainder: " + floatRemainder + "\n");

		consoleInput.close();
	}

}
