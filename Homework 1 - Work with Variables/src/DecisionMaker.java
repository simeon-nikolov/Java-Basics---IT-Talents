import java.util.Locale;
import java.util.Scanner;

//������ 7:
//�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
//���� (����� � ������� �������), ���� ��� ����� � ����� ���.
//��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
//������� �����:
// - ��� ��� �����, ���� �� �������
// - ��� ���� ����, �� �� ���� ���������
// - ��� ����� � �� ���� ����� � �� ��� ���
// - ��� ��� �����, �� ����� �� ���� � ��������
// - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
//���������� ������� �������� ���� ��������� � ���������.

public class DecisionMaker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner consoleInput = new Scanner(System.in);

		System.out.println("Please enter: ");
		System.out.print("What hour is it now: ");
		int hour = consoleInput.nextInt();
		hour = hour + 1 - 1; // To get rid of the ANNOYING WARNING!!! that the variable is not used
		System.out.print("How much money do you have: ");
		float money = consoleInput.nextFloat();
		boolean isHealthy = false;

		boolean valid = false;
		do {
			System.out.print("Are you healthy? (Yes/No): ");
			String answer = consoleInput.next();
			valid = answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");;
			
			if (valid) {
				isHealthy = answer.equalsIgnoreCase("yes");
			}
			else {
				System.out.println("Please enter a valid answer!");
			}
			
		} while (!valid);
		
		if (!isHealthy) {
			System.out.println("I won't go out.");
			
			if (money > 0) {
				System.out.println("I will buy medicine.");
			}
			else {
				System.out.println("I will stay home and drink tea.");
			}
		} else {
			if (money >= 10) {
				System.out.println("I will go to cinema with friends.");
			}
			else {
				System.out.println("I will go to cafe.");
			}
		}
		
		consoleInput.close();

	}

}
