import java.util.Locale;
import java.util.Scanner;

//Задача 24:
//Едно число X е палиндром, aко се чете еднакво отпред назад и 
//отзад напред.
//Да се състави програма, която проверява дали въведено число е 
//палиндром.
//Входни данни: N - естествено число от интервала [10 .. 30000].
//Пример: 17571
//Изход: числото е палиндром 
//Използвайте цикъл do-while. 

public class Task24_PalindromChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int number = 0;

		do {
			System.out.print("Enter a number [10..30000]: ");
			number = consoleInput.nextInt();
		} while (number < 10 || number > 30000);
		
		int depth = 0;
		boolean palindrom = true;
		
		int workNumber = number;
		
		do {
			workNumber /= 10;
			depth++;
		} while (workNumber >= 10);
		
		workNumber = number;
		
		do {
			int powerOfTen = 1;
			for (int i = 0; i < depth; i++) {
				powerOfTen *= 10;
			}
			
			int digit1 = workNumber % 10;
			int digit2 = (number / powerOfTen) % 10;
			
			if (digit1 != digit2) {
				palindrom = false;
				break;
			}
			
			workNumber /= 10;
			depth--;
		} while (depth > 0);
		
		if (palindrom) {
			System.out.println("The number is a palindrom");
		} else {
			System.out.println("The number is NOT a palindrom");
		}
		
		consoleInput.close();

	}

}
