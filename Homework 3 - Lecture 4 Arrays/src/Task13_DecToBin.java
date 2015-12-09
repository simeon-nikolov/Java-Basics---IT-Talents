import java.util.Locale;
import java.util.Scanner;

//Задача 13:
//Да се състави програма, чрез която се въвежда число и се представя
//като число в двоична бройна система.
//Програмата, чрез масив, да изчислява последователно всички цифри
//на въведеното естествено число в 2-ична бройна система.
//Пример: 99
//Изход: 1100011

public class Task13_DecToBin {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = consoleInput.nextInt();
		int[] binary = new int[32];
		int index = 0;
		boolean negative = number < 0;
		
		if (negative) {
			number++;
		}
		
		while (number != 0) {
			binary[index] = number % 2;
			number /= 2;
			index++;
		}
		
		for (index = 0; index < binary.length / 2; index++) {
			int swap = binary[index];
			binary[index] = binary[binary.length - index - 1];
			binary[binary.length - index - 1] = swap;
		}
		
		if (negative) {
			for (index = 0; index < binary.length; index++) {
				binary[index] = 1 - (-binary[index]);
			}
		}
		
		boolean print = false;
		
		for (index = 0; index < binary.length; index++) {
			if (binary[index] == 1) {
				print = true;
			}
			
			if (print) {
				System.out.print(binary[index]);
			}
		}
		
		consoleInput.close();

	}

}
