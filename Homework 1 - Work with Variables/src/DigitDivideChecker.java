import java.util.Locale;
import java.util.Scanner;

//������ 11:
//��������� ��������, ����� �� ������ ���������o ����� ���������
//���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
//���� ����� 0.

public class DigitDivideChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a 3 digit number (no 0 in digits pls): ");
		int number = consoleInput.nextInt();
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;

		if ((number % firstDigit == 0) && (number % secondDigit == 0)
				&& (number % thirdDigit == 0)) {
			System.out.println("The numver " + number
					+ " divides by all of its digits " + firstDigit + " "
					+ secondDigit + " " + thirdDigit + " ");

		} else {
			System.out.println("The numver " + number
					+ " DOES NOT divide by all of its digits " + firstDigit + " "
					+ secondDigit + " " + thirdDigit + " ");
		}

		consoleInput.close();

	}

}
