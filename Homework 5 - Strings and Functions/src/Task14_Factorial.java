import java.util.Locale;
import java.util.Scanner;

//Задача 14:
//Да се състави метод, който приема за стойност число N и връща
//стойността на N! (N факториел).

public abstract class Task14_Factorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = consoleInput.nextInt();
		long factorial = factorial(number);
		System.out.println(factorial);
		consoleInput.close();
		
	}

	private static long factorial(int number) {
		long factorial = 1;
		
		for (int num = 2; num <= number; num++) {
			factorial *= num;
		}
		
		return factorial;
	}

}
