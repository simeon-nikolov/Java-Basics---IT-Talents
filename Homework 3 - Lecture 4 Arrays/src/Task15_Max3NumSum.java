import java.util.Locale;
import java.util.Scanner;

//Задача 15:
//Да се състави програма, която въвежда в едномерен масив реални
//числа.
//Като изход: програма извежда онези 3 различни числа, чиято
//абсолютна стойност формира максималната обща сума.
//Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
// size: 6
// array: 7.13 0.2 4.9 5.1 6.34 1.12
//Изход: 5.1; 6.34; 7.13

public class Task15_Max3NumSum {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter array size (size > 2): ");
			size = consoleInput.nextInt();
		} while (size < 3);
		
		float[] array = new float[size];
		System.out.println("Enter the array: ");

		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextFloat();
		}

		int maxI = 0;
		int maxJ = 1;
		int maxK = 2;
		float sum = 0;
		float maxSum = Float.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					sum = Math.abs(array[i]) + Math.abs(array[j]) + Math.abs(array[k]);

					if (maxSum < sum) {
						maxSum = sum;
						maxI = i;
						maxJ = j;
						maxK = k;
					}

					sum = 0;
				}
			}
		}

		System.out.print(array[maxI] + " " + array[maxJ] + " " + array[maxK]);

		consoleInput.close();

	}

}
