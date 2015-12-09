//Задача 20:
//Да се състави програма, чрез която се извежда квадрат от 
//цифри. Сумите от елементите на произволен ред или стълб са 
//равни на 45.
//Пример:
//1 2 3 4 5 6 7 8 9 0
//2 3 4 5 6 7 8 9 0 1
//3 4 5 6 7 8 9 0 1 2
//4 5 6 7 8 9 0 1 2 3
//5 6 7 8 9 0 1 2 3 4
//6 7 8 9 0 1 2 3 4 5
//7 8 9 0 1 2 3 4 5 6
//8 9 0 1 2 3 4 5 6 7
//9 0 1 2 3 4 5 6 7 8
//0 1 2 3 4 5 6 7 8 9

public class Task20_SquareSum45 {

	public static void main(String[] args) {
		int offset = 1;
		
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				int sum = col + offset;
				
				if (sum >= 10) {
					sum -= 10;
				}
				
				System.out.print(sum + " ");
			}
			
			System.out.println();
			offset++;
		}

	}

}
