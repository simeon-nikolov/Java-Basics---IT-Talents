import java.util.Locale;
import java.util.Scanner;

//Задача 9:
//Да се състави програма, чрез която по въведен низ съдържащ букви, 
//цифри, знак минус '-' се извежда сборът на въведените числа като се 
//отчита знакът '-' пред съответното число.
//Вход: asd-12sdf45-56asdf100
//Изход:
//-12
//45
//-56
//100
//Сума = 77 

public class Task09_SumNumText {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = consoleInput.next();
		long sum = 0;
		boolean isNegative = false;
		int number = 0;
		
		for (int index = 0; index < input.length(); index++) {
			if (isDigit(input.charAt(index))) {
				int digit = input.charAt(index) - '0';
				number = number * 10 + digit;
			}
			else {
				if (isNegative) {
					sum -= number;
					isNegative = false;
				}
				else {
					sum += number;
				}
				
				number = 0;
			}
			
			if (input.charAt(index) == '-') {
				if (index < (input.length() - 1) && isDigit(input.charAt(index + 1))) {
					isNegative = true;
				}
			}
			
		}
		
		if (isNegative) {
			sum -= number;
		}
		else {
			sum += number;
		}
		
		System.err.println(sum);
		
		consoleInput.close();
		
	}

	private static boolean isDigit(char symbol) {
		if (('0' <= symbol) && (symbol <= '9')) {
			return true;
		}
		
		return false;
	}

}
