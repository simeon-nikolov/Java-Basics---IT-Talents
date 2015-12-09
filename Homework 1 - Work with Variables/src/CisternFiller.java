import java.util.Locale;
import java.util.Scanner;

//������ 10:
//������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
//3 ����� � �� �������� ������������.
//�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
//��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
//������. ������ �� ����� �� �� ������� � �������� ���������� ����.
//������ �����: ���������� ����� �� ��������� [10..9999].
//������: 107
//�����: 21 ���� �� 2 �����,
// 21 ���� �� 3 �����
// ������������ ���� �� 2 �����

public class CisternFiller {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter cistern volume: ");
		int volume = consoleInput.nextInt();
		int fillTimes = volume / 5;
		int remainder = volume % 5;

		if (remainder == 0) {
			System.out.println(fillTimes + " times of 2 liters.");
			System.out.println(fillTimes + " times of 3 liters.");
		} else {
			if (remainder == 1) {
				System.out.println((fillTimes - 1) + " times of 2 liters.");
				System.out.println((fillTimes - 1) + " times of 3 liters.");
				System.out.println("additionally 2 buckets of 3 liters.");
			} else {
				if (remainder == 2) {
					System.out.println(fillTimes + " times of 2 liters.");
					System.out.println(fillTimes + " times of 3 liters.");
					System.out.println("additionally bucket of 2 liters.");
				} else {
					if (remainder == 3) {
						System.out.println(fillTimes + " times of 2 liters.");
						System.out.println(fillTimes + " times of 3 liters.");
						System.out.println("additionally bucket of 3 liters.");
					} else {
						if (remainder == 4) {
							System.out.println(fillTimes
									+ " times of 2 liters.");
							System.out.println(fillTimes
									+ " times of 3 liters.");
							System.out
									.println("additionally 2 buckets of 2 liters.");
						}
					}
				}
			}
		}

		consoleInput.close();
	}

}
