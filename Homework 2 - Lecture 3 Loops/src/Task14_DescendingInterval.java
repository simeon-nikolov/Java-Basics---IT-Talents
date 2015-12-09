import java.util.Locale;
import java.util.Scanner;

//Задача 14: Да се състави програма, която по въведено 
//естествено число N от интервала [10..200] извежда в обратен 
//ред всички числа, които са кратни на 7 и са по-малки от N.

public class Task14_DescendingInterval {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.print("Enter N [10..200]: ");
			number = consoleInput.nextInt();
		} while (number < 10 || number > 200);
		
		for (int num = number - 1; num >= 10; num--) {
			if (num % 7 == 0) {
				System.out.println(num);
			}
		}
		
		consoleInput.close();

	}

}
