import java.util.Locale;
import java.util.Scanner;

//Задача 7:
//Напишете програма, която първо чете масив  и после създава нов 
//масив със същия размер по следния начин: стойността на всеки 
//елемент от втория масив да е равна на сбора от предходния и 
//следващият елемент на съответния елемент от първия масив.
//Да се изведе получения масив.

public class Task07_NewArrayCreator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Entor array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] array1 = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array1.length; index++) {
			array1[index] = consoleInput.nextInt();
		}
		
		int[] array2 = new int[array1.length];
		array2[0] = array1[1];
		System.out.print(array2[0] + " ");
		
		for (int index = 1; index < array1.length - 1; index++) {
			array2[index] = array1[index - 1] + array1[index + 1];
			System.out.print(array2[index] + " ");
		}
		
		array2[size - 1] = array1[size - 2];
		System.out.print(array2[size - 1] + " ");
		
		consoleInput.close();

	}

}
