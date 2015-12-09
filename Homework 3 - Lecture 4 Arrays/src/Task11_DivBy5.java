import java.util.Locale;
import java.util.Scanner;

//Задача 11:
//Да се състави програма, която въвежда от клавиатурата 7 цели числа
//в едномерен масив
//Програмата да изведе всички числа кратни на 5, но по големи от 5.
//Пример: -23, -55, 17, 75, 56, 105, 134
// -23 -55 17 75 56 105 134
//Изход: 75,105 2 числа

public class Task11_DivBy5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
		}
		
		int count = 0;
		
		for (int index = 0; index < array.length; index++) {
			if ((array[index] % 5 == 0) && (array[index] > 5)) {
				System.out.print(array[index] + ",");
				count++;
			}
		}
		
		System.out.print(" (" + count +" numbers)");
		
		consoleInput.close();

	}

}
