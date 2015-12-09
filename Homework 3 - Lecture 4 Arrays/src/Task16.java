import java.util.Locale;
import java.util.Scanner;

//������ 16:
//�� �� ������� ��������, ���� ����� ������������� �������� 10
//������ ����� �� ��������� �� ���������� �� ������� �����:
//1. ������� �������������� �����.
//2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
//������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
//�������� �� ������� � �������������� ����� ����� ������� �
//�������� ������� �����
//3. �� �� ������� ���������� �� �������� � ��������������� �����.
//4. �� �� ������� �������� �������� �� ������ �������� �� ������
//������, ����� �� �������� �� 0.
//������: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
// size: 10
// array: -1.12 -2.43 3.1 4.2 0 6.4 -7.5 8.6 9.1 -4
//�����: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25

public class Task16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size  = consoleInput.nextInt();		
		double[] array = new double[size];
		System.out.println("Enter the array: ");

		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextDouble();
		}
		
		// 1. ������� �������������� �����.
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		System.out.println("\n");
		
		// 2. ������ �������� ��� �������� ��-����� �� -0.231 �� ������� ���
		//������ �� �������� �� ������� �� + ������� 41.25, � ������ ��������
		//�������� �� ������� � �������������� ����� ����� ������� �
		//�������� ������� �����
		
		double[] newArray = new double[size];
		
		for (int index = 0; index < array.length; index++) {
			if (array[index] < -0.231) {
				newArray[index] = ((index + 1) * (index + 1)) + 41.25;
			} else {
				newArray[index] = (array[index] * (index + 1));
			}
		}
		
		// 3. �� �� ������� ���������� �� �������� � ��������������� �����.
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}
		
		System.out.println();
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(newArray[index] + " ");
		}
		
		System.out.println();
		
		//4. �� �� ������� �������� �������� �� ������ �������� �� ������
		//������, ����� �� �������� �� 0.
		
		double sum = 0F;
		int zeros = 0;
		
		for (int index = 0; index < array.length; index++) {
			sum += newArray[index];
			
			if (newArray[index] == 0) {
				zeros++;
			}
		}
		
		int count = size - zeros;
		double mean = sum / count;
		
		System.out.println("Mean value: " + mean);

		consoleInput.close();
	}

}
