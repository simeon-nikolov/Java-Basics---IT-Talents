import java.util.Locale;
import java.util.Scanner;

//Задача 6:
//Напишете програма, която първо чете 2 масива и после извежда 
//съобщение дали са еднакви, и дали са с еднакъв размер.

public class Task06_ArrayComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter first array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] array1 = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array1.length; index++) {
			array1[index] = consoleInput.nextInt();
		}
		
		do {
			System.out.print("Enter second array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] array2 = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array2.length; index++) {
			array2[index] = consoleInput.nextInt();
		}
		
		// Compare the arrays:
		
		if (array1.length == array2.length) {
			System.out.println("The arrays' lenghts are equal.");
			int index = 0;
			
			for (index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index]) {
					System.out.println("The arrays are not equal.");
					break;
				}
			}
			
			if (index == array1.length) {
				System.out.println("The arrays are equal.");
			}
		} else {
			System.out.println("The arrays have different lenghts therefore they are not equal.");
		}
		
		consoleInput.close();

	}

}
