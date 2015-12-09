import java.util.Locale;
import java.util.Scanner;

//Задача 4:
//Да се прочете масив и да се отпечата дали е огледален.
//Следните масиви са огледални:
//[3 7 7 3]
//[4]
//[1 55 1]
//[6 27 -1 5 7 7 5 -1 27 6]
		
public class Task04_MirrorArrayChecker {

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
		
		boolean mirror = true;
		
		for (int index = 0; index < size; index++) {
			if ((numbers[index] ^ numbers[size - index - 1]) != 0) {
				mirror = false;
				break;
			}
		}
		
		if (mirror) {
			System.out.println("Mirror Array");
		} else {
			System.out.println("Not Mirror Array");
		}
		
		consoleInput.close();

	}

}
