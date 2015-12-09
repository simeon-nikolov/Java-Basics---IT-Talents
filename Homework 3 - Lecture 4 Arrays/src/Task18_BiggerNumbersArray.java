//Задача 18:
//Дадени са два едномерни масива с естествени числа.
//Да се състави програма, която сравнява всички числа с еднакви
//индекси от двата масива и записва в трети масив, по-голямото от
//двете числа.
//Да се изведе съдържанието и на трите масива
//Пример:
//18,19,32,1,3, 4, 5, 6, 7, 8
//1, 2, 3,4,5,16,17,18,27,11
//Изход:
//18,19,32 ,4,5,16,17,18,27,11

public class Task18_BiggerNumbersArray {

	public static void main(String[] args) {
		int[] firstArray = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] secondArray = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int minLength = (firstArray.length < secondArray.length) ? firstArray.length : secondArray.length;
		int[] thirdArray = new int[minLength];
		
		for (int index = 0; index < firstArray.length; index++) {			
			System.out.format("%3d ", firstArray[index]);
		}
		
		System.out.println();
		
		for (int index = 0; index < secondArray.length; index++) {			
			System.out.format("%3d ", secondArray[index]);
		}
		
		System.out.println("\n");
		
		for (int index = 0; index < minLength; index++) {
			if (firstArray[index] > secondArray[index]) {
				thirdArray[index] = firstArray[index];
			} else {
				thirdArray[index] = secondArray[index];
			}
			
			System.out.format("%3d ", thirdArray[index]);
		}

	}

}
