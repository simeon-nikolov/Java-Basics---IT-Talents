import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Задача 12:
//Да се създаде метод, който приема за входни данни число N и
//връща масив от числа с дължина N, който съдържа всички числа
//от 1 до N.

public class Task12_ArrayCreater {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter lenght of the array: ");
		int length = consoleInput.nextInt();
		int[] array = createArray(length);
		System.out.println(Arrays.toString(array));
		consoleInput.close();
		
	}

	private static int[] createArray(int length) {
		int[] array = new int[length];
		
		for (int i = 1; i <= array.length; i++) {
			array[i - 1] = i;
		}
		
		return array;
	}
}
