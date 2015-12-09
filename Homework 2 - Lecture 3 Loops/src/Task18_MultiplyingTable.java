import java.util.Locale;
import java.util.Scanner;

//Задача 18: 
//Да се състави програма, чрез която се въвежда две числа от 
//интервала [1..9].
//Програмата да извежда таблицата за умножение.
//Максималната стойност на множителите е определена от 2-те 
//числа.
//Пример: 2 2 
//Изход:
//1*1= 1; 
//1*2= 2;
//2*1= 2; 
//2*2= 4;

public class Task18_MultiplyingTable {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		
		do {
			System.out.print("Enter first number [1..9]: ");
			number1 = consoleInput.nextInt();
		} while (number1 < 1 || number1 > 9);
		
		do {
			System.out.print("Enter second number [1..9]: ");
			number2 = consoleInput.nextInt();
		} while (number2 < 1 || number2 > 9);
		
		for (int num1 = 1; num1 <= number1; num1++) {
			for (int num2 = 1; num2 <= number2; num2++) {
				System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
			}
		}
		
		consoleInput.close();

	}

}
