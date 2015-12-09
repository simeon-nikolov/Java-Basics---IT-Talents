import java.util.Locale;
import java.util.Scanner;

//Задача 12:
//Да се състави програма, чрез която по предварително въведени 7
//числа в едномерен масив се разменят местата на елементи с индекси:
//- 0 и 1 чрез трета променлива;
//- 2 и 3 чрез събиране;
//- 4 и 5 чрез умножение.
//Пример: 1,2,3,4,5,6,7
//Изход: 2,1,4,3,6,5,7

public class Task12_SwapNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
		}
		
		// with 3rd variable
		int swap = array[0];
		array[0] = array[1];
		array[1] = swap;
		
		// with summing and subtracting
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		
		// with multiplying and dividing
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];
		                          
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		consoleInput.close();

	}

}
