import java.util.Locale;
import java.util.Scanner;

//������ 8:
//�� �� ������� ��������, ����� ���� �� ��������� 4-������o
//���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
//�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
//� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
//3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
//���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
//������: 3332 �����: ��-����� (32<33)
//������: 1144 �����: ����� (14=14)
//������: 9875 �����: ��-������ (95>87)

public class NewNummbersComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.print("Please enter a 4 digit number: ");
		int number = consoleInput.nextInt();

		int firstNumber = 10 * (number / 1000) + (number % 10);
		int secondNumber = 10 * ((number % 1000) / 100) + ((number % 100) / 10);

		if (firstNumber < secondNumber) {
			System.out.println("��-����� (" + firstNumber + "<" + secondNumber + ")");
		} else {
			if (firstNumber > secondNumber) {
				System.out.println("��-������ (" + firstNumber + ">" + secondNumber + ")");
			} else {
				System.out.println("����� (" + firstNumber + "=" + secondNumber + ")");
			}
		}

		consoleInput.close();
	}

}
