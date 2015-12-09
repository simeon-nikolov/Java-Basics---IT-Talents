import java.util.Locale;
import java.util.Scanner;

//Задача 13: Да се състави програма, която извежда всички 
//естествени трицифрени числа, които имат сбор на цифрите равен
//на дадено число.
//Дадено : sum, където 2>=sum<=27.
//Пример: 26
//Изход: 899, 989, 998.

public class Task13_ThreeDigitSumNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Sum: ");
		int sum = consoleInput.nextInt();
		
		for (int num = 100; num < 1000; num++) {
			int firstDigit = num / 100;
			int secondDigit = (num / 10) % 10;
			int thirdDigit = num % 10;
			
			if (firstDigit + secondDigit + thirdDigit == sum) {
				System.out.println(num);
			}
		}
		
		consoleInput.close();

	}

}
