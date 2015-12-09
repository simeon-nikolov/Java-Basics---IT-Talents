import java.util.Locale;
import java.util.Scanner;

//������ 15:
//�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
//[0..24].
//���������� �� ������ ������������� ��������� ��������� ���������
//���.
//��������� ��:
//[18..4] - ����� �����;
//[4..9] - ����� ����;
//[9..18] - ����� ���
//������: 10
//�����: ����� ���

public class DayTime {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);
		System.out.print("Enter an hour [0..24]: ");
		int hour = consoleInput.nextInt();
		
		if (hour < 0 || hour > 24) {
			System.out.println("Invalid hour!");
		} else if (hour <= 4 || hour >= 18) {
			System.out.println("Good evening!");
		} else if (hour <= 9) {
			System.out.println("Good morning!");
		} else if (hour < 18) {
			System.out.println("Good day!");
		}
		
		consoleInput.close();

	}

}
