import java.util.Locale;
import java.util.Scanner;

//Задача 22:
//Да се състави програма, която извежда първите 10 най-малки 
//числа, които се делят на 2, 3 или на 5 и които са по-големи от 
//въведено естествено число.
//Числата се извеждат, заедно с техния пореден номер.
//Входни данни: число от интервала [1..999]
//Пример: 1
//Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
//Използвайте цикъл while. 

public class Task22_TenNumbersByConditions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int number = 0;

		do {
			System.out.print("Enter a number [1..999]: ");
			number = consoleInput.nextInt();
		} while (number < 1 || number > 999);

		int index = 1;

		while (index <= 10) {
			if ((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0)) {
				System.out.print(index + ":" + number);
				
				if (index != 10) {
					System.out.print(", ");
				}
				
				index++;
			}
			
			number++;
		}

		consoleInput.close();

	}

}
