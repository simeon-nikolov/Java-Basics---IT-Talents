import java.util.Locale;
import java.util.Scanner;

//������ 10:
//�� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
//��������� �����.
//���������� �� ������ �������, ����� � ���-������ �� ��������
//�������� �� ���������� �����.
//������: 1,2,3,4,5,6,7
//�����: ������ �������� 4, ���-������ �������� 4

public class Task10_MeanNumber {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		int sum = 0;
		int size = 7;
		int[] array = new int[size];
		System.out.println("Enter the array: ");
		
		for (int index = 0; index < array.length; index++) {
			array[index] = consoleInput.nextInt();
			sum += array[index];
		}
		
		double mean = (double) sum / size;
		double minDifferece = sum;
		int minDiffereceIndex = 0;
		
		for (int index = 0; index < array.length; index++) {
			double difference = Math.abs((double) Math.abs(array[index]) - Math.abs(mean));
			
			if (difference < minDifferece) {
				minDifferece = difference;
				minDiffereceIndex = index;
			}
		}
		
		System.out.println(array[minDiffereceIndex]);
		
		consoleInput.close();

	}

}
