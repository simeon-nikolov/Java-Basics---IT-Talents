import java.util.Locale;
import java.util.Scanner;

//Задача 1: 
//Да се прочете масив и да се намери най-малкото число кратно на
//3 от масива.
//
//10, 3, 5, 8, 6, -3, 7
//Най-малкото число кратно на 3 е -3

public class Task01_MinMultipleOfThree {

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
		
		int min = Integer.MAX_VALUE;
		boolean valueChanged = false;
		
		for (int index = 0; index < numbers.length; index++) {
			if ((min >= numbers[index]) && (numbers[index] % 3 == 0)) {
				min = numbers[index];
				valueChanged = true;
			}
		}
		
		System.out.println();
		
		if (valueChanged) {
			System.out.print("The minimal number multiple of 3 is: " + min);
		} else {
			System.out.println("There are no numbers multiple of 3 in the array!");
		}
		
		consoleInput.close();

	}

}
