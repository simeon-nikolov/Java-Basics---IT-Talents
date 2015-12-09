//Задача 3:
//Имате двумерен масив от числа, чийто стойности са въведени
//предварително. Да се отпечатат сумата на елементите на масива,
//както и средноаритметичното на тези числа.

public class Task03_SumAndMean {

	public static void main(String[] args) {
		int[][] array = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65},
		};
		
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				sum += array[row][col];
				count++;
			}
		}
		
		double mean = (double) sum / count;
		System.out.println("Sum: " + sum + "\nMean: " + mean);

	}

}
