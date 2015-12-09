import java.util.Locale;
import java.util.Scanner;

//Задача 16: 
//Да се състави програма, чрез която се въвеждат 2 естествени 
//числа N, M от интервала [10..5555].
//Програмата, чрез цикъл for, да извежда всички числа от 
//интервала, които са кратни на 50 в низходящ ред.
//Пример: 25,249 
//Изход: 200,150,100, 50.

public class Task16_DescendingNumsBy50 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int limit1 = 0;
		int limit2 = 0;
		
		do {
			System.out.print("Enter N [10..5555]: ");
			limit1 = consoleInput.nextInt();
		} while (limit1 < 10 || limit1 > 5555);
		
		do {
			System.out.print("Enter M [10..5555]: ");
			limit2 = consoleInput.nextInt();
		} while (limit2 < 10 || limit2 > 5555);
		
		int bigger = limit1;
		int smaller = limit2;
		
		if (limit1 < limit2) {
			bigger = limit2;
			smaller = limit1;
		}
		
		for (int num = bigger; num >= smaller; num--) {
			if (num % 50 == 0) {
				System.out.println(num);
			}
		}
		
		consoleInput.close();

	}

}
