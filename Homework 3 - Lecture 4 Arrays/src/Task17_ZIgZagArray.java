import java.util.Locale;
import java.util.Scanner;

//������ 17:
//���� ������ �� ���������� ����� �� �������� �������������� ������,
//��� �� ���������� � �� ���������� ���������:
//N1 < N2 > N3 < N4 > N5 <..
//��������� ��������, ����� ��������� ���� �������� � ���������
//����� ������ �� ����� ���������� ������� ����������.
//������: 1 3 2 4 3 7
//�����: ��������� ������������ �� �������������� ������ ������

public class Task17_ZIgZagArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Size: ");
		int size = sc.nextInt();
		int[] numbers = new int[size];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		int index = 0;

		for (index = 1; index < numbers.length - 1; index++) {
			if (!(((numbers[index - 1] < numbers[index]) && (numbers[index] > numbers[index + 1]))
					|| ((numbers[index - 1] > numbers[index]) && (numbers[index] < numbers[index + 1])))) {
				System.out.println("The array is not zig-zag!");
				break;
			}
		}

		if (index == numbers.length - 1) {
			System.out.println("The array is zaig-zag.");
		}

		sc.close();

	}

}
