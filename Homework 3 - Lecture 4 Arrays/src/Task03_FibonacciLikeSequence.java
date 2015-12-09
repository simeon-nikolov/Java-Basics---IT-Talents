import java.util.Locale;
import java.util.Scanner;

//Задача 3:
//Да се въведе число, след което да се създаде масив с 10 
//елемента по следния начин:
//Първите 2 елемента на масива са въведеното число.
//Всеки следващ елемент на масива е равен на сбора от 
//предишните 2 елемента в масива.
//След това изведете масива .
 
public class Task03_FibonacciLikeSequence {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter array size (size > 1): ");
			size = consoleInput.nextInt();
		} while (size <= 1);
		
		int[] numbers = new int[size];
		System.out.print("Enter a starting number (!= 0): ");
		int start = consoleInput.nextInt();
		numbers[0] = start;
		numbers[1] = start;
		
		for (int index = 2; index < numbers.length; index++) {
			numbers[index] = numbers[index - 2] + numbers[index - 1];
		}
		
		for (int index = 0; index < numbers.length; index++) {
			System.out.print(numbers[index] + " ");
		}
		
		consoleInput.close();
	}

}
