import java.util.Locale;
import java.util.Scanner;

//Задача 8:
//Напишете програма, която намира и извежда най-дългата редица от 
//еднакви поредни елементи в даден масив.

public class Task08_LongestSequenceInArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Entor array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
		}
		
		// Finding longest sequence:
		
		int count = 1;
		int maxCount = 1;
		int number = array[0];
		int maxNumber = number;
		
		for (int index = 1; index < array.length; index++) {
			if (array[index] == array[index - 1]) {
				count++;
				
				if (maxCount < count) {
					maxCount = count;
					maxNumber = array[index];
				}
			} else {
				count = 1;
			}
		}
		
		System.out.println("Longest sequence: ");
		
		for (int index = 0; index < maxCount; index++) {
			System.out.print(maxNumber + " ");
		}
		
		consoleInput.close();

	}

}
