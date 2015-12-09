import java.util.Locale;
import java.util.Scanner;

//������ 12:
//��������� ������ �� ������ ������ ������ �� 4 � ����������
//����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
//�� 1600 � 2000 �� ���������.
//��������� ��������, ����� �� ������ ���, �����, ������ ���������
//���������� ����.
//������ �����: ��� ����� �� ���, �����, ������.
//������: 28, 2, 2000
//�����: 1,3,2000 <- ������� � ������ -������ �� � 29,3,2000

public class DateIncrementer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter a day (1-31): ");
		int day = consoleInput.nextInt();
		System.out.print("Enter a month (1-12): ");
		int month = consoleInput.nextInt();
		System.out.print("Enter an year (0-infinite):");
		int year = consoleInput.nextInt();
		boolean leapYear = true;

		if (year % 4 != 0) {
			leapYear = false;
		} else if ((year % 100 == 0) && (year % 400 != 0)) {
			leapYear = false;
		}

		if (leapYear && month == 2 && day == 29) {
			day = 1;
			month++;
		} else if (!leapYear && month == 2 && day == 28) {
			day = 1;
			month++;
		} else if (day < 30) {
			day++;
		} else if (day == 30) {
			if (((month <= 7) && (month % 2 == 0))
					|| ((month >= 8) && (month % 2 == 1))) {
				day = 1;
				month++;
			} else {
				day++;
			}
		} else if (day == 31) {
			day = 1;

			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		}

		System.out.println(day + "," + month + "," + year);

		consoleInput.close();
	}
}
