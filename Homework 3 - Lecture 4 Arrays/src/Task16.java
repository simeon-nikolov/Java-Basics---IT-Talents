import java.util.Locale;
import java.util.Scanner;

//Задача 16:
//Да се състави програма, чрез която предварително въведени 10
//реални числа от интервала се обработват по следния начин:
//1. Извежда съществуващите числа.
//2. Всички елементи със стойност по-малки от -0.231 се заменят със
//сумата от квадрата на индекса им + числото 41.25, а всички останали
//елементи се заменят с произведението между самия елемент и
//неговият пореден номер
//3. Да се изведат елементите от началния и новообразувания масив.
//4. Да се изведат средната стойност на всички елементи от новата
//редица, които са различни от 0.
//Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
// size: 10
// array: -1.12 -2.43 3.1 4.2 0 6.4 -7.5 8.6 9.1 -4
//Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

public class Task16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size  = consoleInput.nextInt();		
		double[] array = new double[size];
		System.out.println("Enter the array: ");

		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextDouble();
		}
		
		// 1. Извежда съществуващите числа.
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		System.out.println("\n");
		
		// 2. Всички елементи със стойност по-малки от -0.231 се заменят със
		//сумата от квадрата на индекса им + числото 41.25, а всички останали
		//елементи се заменят с произведението между самия елемент и
		//неговият пореден номер
		
		double[] newArray = new double[size];
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] < -0.231) {
				newArray[index] = ((index + 1) * (index + 1)) + 41.25;
			} else {
				newArray[index] = (array[index] * (index + 1));
			}
		}
		
		// 3. Да се изведат елементите от началния и новообразувания масив.
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		System.out.println();
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(newArray[index] + " ");
		}
		
		System.out.println();
		
		//4. Да се изведат средната стойност на всички елементи от новата
		//редица, които са различни от 0.
		
		double sum = 0F;
		int zeros = 0;
		
		for (int index = 0; index < array.length; index++) {
			sum += newArray[index];
			
			if (newArray[index] == 0) {
				zeros++;
			}
		}
		
		int count = size - zeros;
		double mean = sum / count;
		
		System.out.println("Mean value: " + mean);

		consoleInput.close();
	}

}
