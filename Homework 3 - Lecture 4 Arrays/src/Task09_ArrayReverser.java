import java.util.Locale;
import java.util.Scanner;

//������ 9:
//�������� ��������, � ����� ����������� ������� �����, ���� ����� 
//���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
//�� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� �� 
//�������� � �������� ���). ��������� �� ������ �������� ����� � ����
//������������ ����� � ����� ��� �� ���������� ���� �����.

public class Task09_ArrayReverser {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 0;
		
		do {
			System.out.print("Entor array size (size > 0): ");
			size = consoleInput.nextInt();
		} while (size <= 0);
		
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
		}
		
		// With the help of another array:
		
		int[] reversedArray = new int[array.length];
		
		for (int index = 0; index < reversedArray.length; index++) {
			reversedArray[index] = array[size - index - 1];
			System.out.print(reversedArray[index] + " ");
		}
		
		System.out.println();
		
		// Without using another array:
		
		for (int index = 0; index < array.length / 2; index++) {
			int swap = array[index];
			array[index] = array[size - index - 1];
			array[size - index - 1] = swap;
		}
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		consoleInput.close();

	}

}
