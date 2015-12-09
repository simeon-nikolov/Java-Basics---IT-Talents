import java.util.Locale;
import java.util.Scanner;

//Задача 2: 
//Нека по въведен масив да се конструира нов, като половината му
//елементи са точно като на оригиналния, а другите да са тези 
//елементи, но в обратен ред. Последно, да се изведе новия масив 
//на екрана.

public class Task02_MirrorArrayMaker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] numbers = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = consoleInput.nextInt();
		}
		
		// Mirroring the array:
		
		int[] mirrorArray = new int[size];
		
		for (int index = 0; index < size / 2; index++) {
			mirrorArray[index] = numbers[index];
		}
		
		for (int index = size / 2; index < size; index++) {
			mirrorArray[index] = numbers[size - index - 1];
		}
		
		for (int index = 0; index < size; index++) {
			System.out.print(mirrorArray[index] + " ");
		}
		
		consoleInput.close();

	}

}
