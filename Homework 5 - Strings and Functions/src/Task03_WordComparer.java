import java.util.Locale;
import java.util.Scanner;

//������ 3:
//�� �� ������� ��������, ���� ����� �� �������� �������������� ��� 
//������ �� ������� ��� ���������. 
//���������� �� ������� ��������� �� ��������� �� ����������� �� �� 
//�������.
//������: ���������, ���������
//�����:
//����� ���� �� � ����� �������.
//������� �� �������:
//8 �-�
//9 �-� 

public class Task03_WordComparer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String firstString = consoleInput.next();
		String secondString = consoleInput.next();

		if (firstString.length() == secondString.length()) {
			System.out.println("The two strings have equal length.");
		} else {
			System.out.println("The two strings have different lengths.");
		}

		int minLenght = (firstString.length() < secondString.length()) ? firstString
				.length() : secondString.length();

		for (int index = 0; index < minLenght; index++) {
			if (firstString.charAt(index) != secondString.charAt(index)) {
				System.out.println((index + 1) + " "
						+ firstString.charAt(index) + "-"
						+ secondString.charAt(index));
			}
		}

		consoleInput.close();

	}

}
