//Задача 5:
//Напишете програма, която създава масив с 10 елемента и 
//инициализира всеки от елементите със стойност равна на индекса на 
//елемента умножен по 3.
//Да се изведат елементите на екрана.

public class Task05_ArrayInitializator {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for (int index = 0; index < numbers.length; index++) {
			numbers[index] = index * 3;
			System.out.print(numbers[index] + " ");
		}

	}

}
