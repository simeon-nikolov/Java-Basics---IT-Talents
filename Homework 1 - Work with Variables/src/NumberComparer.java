import java.util.Locale;
import java.util.Scanner;

//Задача 1:
//Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//клавиатурата A и B (може да са с плаваща запетая – double).
//После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//Да се изведе подходящо съобщение за това дали C е между A и B.

public class NumberComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Please input number A (double type): ");
		double numberA = consoleInput.nextDouble();
		System.out.println("Please input number B (double type): ");
		double numberB = consoleInput.nextDouble();
		System.out.println("Please input number C (double type): ");
		double numberC = consoleInput.nextDouble();
		
		if ((numberA < numberC) && (numberC < numberB) ||
				(numberB < numberC) && (numberC < numberA)) {
			System.out.println("The number " + numberC + " is between " + numberA + " and " + numberB);
		} else {
			System.out.println("The number " + numberC + " is NOT between " + numberA + " and " + numberB);
		}
		
		consoleInput.close();

	}

}
