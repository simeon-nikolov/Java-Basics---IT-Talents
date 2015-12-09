import java.util.Locale;
import java.util.Scanner;

//Задача 14:
//Имате предварително въведен едномерен масив, съдържащ реални
//числа.
//Да се състави програма, чрез която се избират само елементи със
//стойности от интервала [-2.99..2.99] и новата редица се извежда на
//екрана.
//Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
// size: 11
// array: 7.1 8.5 0.2 3.7 0.99 1.4 -3.5 -110 212 341 1.2
//Изход: 0.2; 0.99; 1.4; 1.2

public class Task14_Interval {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = consoleInput.nextInt();
		float[] array = new float[size];
		int count = 0;
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextFloat();
			
			if ((-2.99 <= array[index]) && (array[index] <= 2.99)) {
				count++;
			}
		}
		
		float[] newArray = new float[count];
		count = 0;
		
		for (int index = 0; index < array.length; index++) {
			if ((-2.99 <= array[index]) && (array[index] <= 2.99)) {
				newArray[count] = array[index];
				System.out.print(newArray[count] + " ");
				count++;
			}
		}
		
		consoleInput.close();

	}

}
