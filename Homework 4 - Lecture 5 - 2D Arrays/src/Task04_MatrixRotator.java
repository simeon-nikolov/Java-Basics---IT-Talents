//Задача 4:
//Имате предварително въведени стойности на елементи в двумерен
//масив - естествени числа.
//Да се състави програма, чрез която се извеждат стойностите на
//елементите в двумерен масив след обръщането му на +90 градуса.
//Пример:
//1,2,3,4
//5,6,7,8
//9,10,11,12
//13,14,15,16
//Изход
//13,9,5,1
//14,10,6,2
//15,11,7,3
//16,12,8,4

public class Task04_MatrixRotator {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		printMatrix(matrix);
		System.out.println();
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] rotMatrix = new int[cols][rows];
		
		for (int col = 0; col < cols; col++) {
			for (int row = rows - 1; row >= 0; row--) {
				rotMatrix[col][rows - row - 1] = matrix[row][col];
			}
		}
		
		printMatrix(rotMatrix);
	}

	private static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.format("%4d", matrix[row][col]);
			}
			
			System.out.println();
		}
		
	}

}
