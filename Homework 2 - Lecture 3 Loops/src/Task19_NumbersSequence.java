import java.util.Locale;
import java.util.Scanner;

//Задача 19: Да се състави програма, чрез която по въведено 
//естествено число от интервала [10..99] се извежда поредица 
//числа, при спазване на следните изисквания:
//1) ако предходното число е четно се извежда 0.5*числото;
//2) ако предходното число е нечетно се извежда 3*числото +1.
//Извеждането продължава докато не се получи стойност 1.
//Пример: 11 
//Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1. 

public class Task19_NumbersSequence {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int number = 0;
		
		do {
			System.out.print("Enter number [10..99]: ");
			number = consoleInput.nextInt();
		} while (number < 10 || number > 99);
		
		while (number != 1) {
			if (number % 2 == 0) {
				number = (int) (0.5 * number);
			} else {
				number = 3 * number + 1;
			}
			
			System.out.print(number + " ");
		}
		
		consoleInput.close();

	}

}
