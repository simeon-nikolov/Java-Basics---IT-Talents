import java.util.Locale;
import java.util.Scanner;

//Задача 2:
//Имате квадратен двумерен масив от естествени числа, чийто стойности
//се въвеждат. Да се отпечатат диагоналите на масива.
//Пример:
//1,4,6,3
//5,9,7,2
//4,8,1,9
//2,3,4,5
//Изход:
//1 9 1 5
//3 7 8 2

public class Task02_MatrixDiagonals {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Enter matrix size: ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print("matrix[" + row + "][" + col + "]=");
				matrix[row][col] = consoleInput.nextInt();
			}
			
			System.out.println();
		}
		
		System.out.println("\nFirst Diagonal: ");
		
		for (int index = 0; index < size; index++) {
			System.out.print(matrix[index][index] + " ");
		}
		
		System.out.println("\n\nSecond Diagonal: ");
		
		for (int index = 0; index < size; index++) {
			System.out.print(matrix[index][size - index - 1] + " ");
		}
		
		consoleInput.close();

	}

}
