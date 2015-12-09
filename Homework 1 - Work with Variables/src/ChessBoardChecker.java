import java.util.Locale;
import java.util.Scanner;

//Задача 14:
//Да се състави програма, която по въведени координати на 2 позиции
//от шахматната дъска извежда отговор дали са оцветени в еднакъв или
//различен цвят.
//Шахматната дъска е квадратна.
//Въвеждат се две двойки числа от интервала [1..8].
//Пример: 2 2 3 2
//Изход: Позициите са с различен цвят

public class ChessBoardChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Please eneter squares coordinates: ");
		int firstXCoord = consoleInput.nextInt();
		int firstYCoord = consoleInput.nextInt();
		int secondXCoord = consoleInput.nextInt();
		int secondYCoord = consoleInput.nextInt();
		int difference1 = firstXCoord - firstYCoord;
		int difference2 = secondXCoord- secondYCoord;
		boolean sameColor = ((difference1 % 2 == 0) == (difference2 % 2 == 0));
		
		if (sameColor) {
			System.out.println("The squares are in same color!");
		} else {
			System.out.println("The squares are in different colors");
		}
		
		consoleInput.close();

	}

}
