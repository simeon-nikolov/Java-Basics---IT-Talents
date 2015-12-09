import java.util.Locale;
import java.util.Scanner;

//Задача 25: 
//Да се направи програма, която по дадено число N, да изчислява 
//N!, т.е. 1*2*3*4...*N.
//Пример: 5
//Изход: 120
//Използвайте цикъл do-while. 

public class Task25_Factorial {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a number N [0..25]: ");
		int number = consoleInput.nextInt();
		long factorial = 1;
		int count = 1;
		
		do {
			factorial *= count;
			count++;
		} while (count <= number);
		
		System.out.println(factorial);
		
		consoleInput.close();

	}

}
