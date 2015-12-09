import java.util.Locale;
import java.util.Scanner;

//Задача 6: Да се прочете число от екрана(конзолата) и да се
//изведе сбора на всички числа между 1 и въведеното число.
//Въдете число:
//7
//Резултата е 28

public class Task06_NumbersSum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = consoleInput.nextInt();
		int sum = 0;
		
		for (int num = 1; num <= number; num++) {
			sum += num;
		}
		
		System.out.println("The result is " + sum);
		
		consoleInput.close();

	}

}
