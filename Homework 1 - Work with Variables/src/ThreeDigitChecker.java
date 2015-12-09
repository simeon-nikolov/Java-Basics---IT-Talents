import java.util.Locale;
import java.util.Scanner;

//������ 16:
//�������� � ���������� ���������� ����� �� ���� abc.
//������ �� �� ������� ����:
//��� a = b = c - �����: ������� �� �����;
//��� a>b>c - �����: ������� �� ��� �������� ���;
//��� a<b<c ������� �� � �������� ���;
//� �����: ������� �� ����������, �� ����������� ������.
//�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
//������� �� ������� � �������.
//������: 345
//�����: �������� ���.

public class ThreeDigitChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a 3 digit number: ");
		int number = consoleInput.nextInt();
		int firstDigit = number / 100;
		int secondDigit = (number / 10) % 10;
		int thirdDigit = number % 10;
		
		if ((firstDigit == secondDigit) && (firstDigit == thirdDigit)) {
			System.out.println("The digits are equal!");
		} else if ((firstDigit > secondDigit) && (secondDigit > thirdDigit)) {
			System.out.println("The digits are in descending order!");
		} else if ((firstDigit < secondDigit) && (secondDigit < thirdDigit)) {
			System.out.println("The digits are in ascending order!");
		} else {
			System.out.println("The digits are unordered, TOTAL CHAOS!!!");
		}
		
		consoleInput.close();

	}

}
