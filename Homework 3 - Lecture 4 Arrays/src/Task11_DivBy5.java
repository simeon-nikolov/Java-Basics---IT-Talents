import java.util.Locale;
import java.util.Scanner;

//������ 11:
//�� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
//� ��������� �����
//���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
//������: -23, -55, 17, 75, 56, 105, 134
// -23 -55 17 75 56 105 134
//�����: 75,105 2 �����

public class Task11_DivBy5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
		}
		
		int count = 0;
		
		for (int index = 0; index < array.length; index++) {
			if ((array[index] % 5 == 0) && (array[index] > 5)) {
				System.out.print(array[index] + ",");
				count++;
			}
		}
		
		System.out.print(" (" + count +" numbers)");
		
		consoleInput.close();

	}

}
