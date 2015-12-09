import java.util.Locale;
import java.util.Scanner;

//Задача 5:
//Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
//ред.

public class DescendingNumbersOutput {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers: ");
		int firstNumber = consoleInput.nextInt();
		int secondNumber = consoleInput.nextInt();
		int thirdNumber = consoleInput.nextInt();
		
		printDescending(firstNumber, secondNumber, thirdNumber);
		printDescending(secondNumber, firstNumber, thirdNumber);
		printDescending(thirdNumber, firstNumber, secondNumber);

//		if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
//			System.out.println(firstNumber);
//			
//			if (secondNumber >= thirdNumber) {
//				System.out.println(secondNumber);
//				System.out.println(thirdNumber);
//			}
//			else {
//				System.out.println(thirdNumber);
//				System.out.println(secondNumber);
//			}
//		}
//		
//		if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
//			System.out.println(secondNumber);
//			
//			if (firstNumber >= thirdNumber) {
//				System.out.println(firstNumber);
//				System.out.println(thirdNumber);
//			}
//			else {
//				System.out.println(thirdNumber);
//				System.out.println(firstNumber);
//			}
//		}
//		
//		if ((thirdNumber >= secondNumber) && thirdNumber >= firstNumber)) {
//			System.out.println(thirdNumber);
//			
//			if (firstNumber >= secondNumber) {
//				System.out.println(firstNumber);
//				System.out.println(secondNumber);
//			}
//			else {
//				System.out.println(secondNumber);
//				System.out.println(firstNumber);
//			}
//		}
		
		consoleInput.close();
	}

	private static void printDescending(int firstNumber, int secondNumber, int thirdNumber) {
		if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
			System.out.println(firstNumber);
			
			if (secondNumber >= thirdNumber) {
				System.out.println(secondNumber);
				System.out.println(thirdNumber);
			}
			else {
				System.out.println(thirdNumber);
				System.out.println(secondNumber);
			}
		}
	}

}
