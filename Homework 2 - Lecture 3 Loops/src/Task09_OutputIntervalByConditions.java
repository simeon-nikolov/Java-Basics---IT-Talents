import java.util.Locale;
import java.util.Scanner;

//Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
//Да се изведат всички числа от А до В на степен 2(разделени с
//запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
//
//Пример:
//	Въдете А:
//	1
//	Въведете B
//	107

public class Task09_OutputIntervalByConditions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter A: ");
		int start = consoleInput.nextInt();
		System.out.println("Enter B: ");
		int end = consoleInput.nextInt();
		
		if (start > end) {
			int swapValue = start;
			start = end;
			end = swapValue;
		}
		
		int sum = 0;
		
		for (int number = start; number <= end; number++) {
			int power = number * number;
			
			if (power % 3 == 0) {
				System.out.print("skip 3,");
			} else {
				sum += power;
				
				if (sum > 200) {
					break;
				}
				
				System.out.print(power + ",");
			}
		}
		
		consoleInput.close();

	}

}
