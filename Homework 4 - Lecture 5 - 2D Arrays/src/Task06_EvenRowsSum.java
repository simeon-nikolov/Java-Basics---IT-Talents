//Задача 6:
//Имате предварително въведени стойности от естествени числа.
//Числата са въведени в квадратна таблица с размери 6 реда и 6
//колони.
//Да се състави програма, чрез която се намира сумата на всички
//елементи от редовете с четни номера: 2,4 и 6.
//Програмата да извежда и сумата на всеки отделен ред.
//Пример:
//11,12,13,14,15,16,
//21,22,23,24,25,26,
//31,32,33,34,35,36,
//41,42,43,44,45,46,
//51,52,53,54,55,56,
//61,62,63,64,65,66
//Изход:
//21,22,23,24,25,26 сума 141
//41,42,43,44,45,46 сума 261
//61,62,63,64,65,66 сума 381
//Сума на елементите 783

public class Task06_EvenRowsSum {

	public static void main(String[] args) {
		int size = 6;
		int[][] matrix = { 
				{ 11, 12, 13, 14, 15, 16 },
				{ 21, 22, 23, 24, 25, 26 }, 
				{ 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, 
				{ 51, 52, 53, 54, 55, 56 },
				{ 61, 62, 63, 64, 65, 66 } 
			};
		int[] rowsSums = new int[size / 2];
		
		for (int row = 0; row < size; row++) {
			if ((row + 1) % 2 == 0) {
				for (int col = 0; col < size; col++) {
					rowsSums[(row + 1) / 2 - 1] += matrix[row][col];
					
					if (col < size - 1) {
						System.out.print(matrix[row][col] + ",");
					}
					else {
						System.out.print(matrix[row][col] + " ");
					}
				}
				
				System.out.println("sum " + rowsSums[(row + 1) / 2 - 1]);
			}
		}
		
		int sum = 0;
		
		for (int index = 0; index < rowsSums.length; index++) {
			sum += rowsSums[index];
		}
		
		System.out.println("Sum of all: " + sum);
		
	}
	

}
