//������ 11:
//�� �� ������� �����, ����� ��������� ����� � ���������.

public class Task11_ArrayPrinter {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		printArray(array);

	}

	private static void printArray(int[] array) {
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
	}

}
